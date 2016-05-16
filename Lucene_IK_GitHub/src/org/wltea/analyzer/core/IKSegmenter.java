/**
 * IK 中文分词  版本 5.0
 * IK Analyzer release 5.0
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 源代码由林良益(linliangyi2005@gmail.com)提供
 * 版权声明 2012，乌龙茶工作室
 * provided by Linliangyi and copyright 2012 by Oolong studio
 */
package org.wltea.analyzer.core;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.cfg.DefaultConfig;
import org.wltea.analyzer.dic.Dictionary;

/**
 * IK分词器主类
 *
 */
public final class IKSegmenter {
	
	//字符窜reader
	private Reader input;
	//分词器配置项
	private Configuration cfg;
	//分词器上下文
	private AnalyzeContext context;
	//分词处理器列表
	private List<ISegmenter> segmenters;
	//分词歧义裁决器
	private IKArbitrator arbitrator;
	

	/**
	 * IK分词器构造函数
	 * @param input 
	 * @param useSmart 为true，使用智能分词策略
	 * 
	 * 非智能分词：细粒度输出所有可能的切分结果
	 * 智能分词： 合并数词和量词，对分词结果进行歧义判断
	 */
	public IKSegmenter(Reader input , boolean useSmart){
		this.input = input;
		// 配置文件
		this.cfg = DefaultConfig.getInstance();
		// 是否智能切分
		this.cfg.setUseSmart(useSmart);
		// 初始化
		this.init();
	}
	
	/**
	 * IK分词器构造函数
	 * @param input
	 * @param cfg 使用自定义的Configuration构造分词器
	 * 
	 */
	public IKSegmenter(Reader input , Configuration cfg){
		this.input = input;
		this.cfg = cfg;
		this.init();
	}
	
	/**
	 * 初始化
	 */
	private void init(){
		//初始化词典单例
		Dictionary.initial(this.cfg);
		//初始化分词上下文
		this.context = new AnalyzeContext(this.cfg);
		//加载子分词器
		this.segmenters = this.loadSegmenters();
		//加载歧义裁决器
		this.arbitrator = new IKArbitrator();
	}
	
	/**
	 * 初始化词典，加载子分词器实现
	 * @return List<ISegmenter>
	 */
	private List<ISegmenter> loadSegmenters(){
		List<ISegmenter> segmenters = new ArrayList<ISegmenter>(4);
		//处理字母的子分词器
		segmenters.add(new LetterSegmenter()); 
		//处理中文数量词的子分词器
		segmenters.add(new CN_QuantifierSegmenter());
		//处理中文词的子分词器
		segmenters.add(new CJKSegmenter());
		return segmenters;
	}
	
	/**
	 * 分词，获取下一个词元
	 * @return Lexeme 词元对象
	 * @throws IOException
	 */
	public synchronized Lexeme next()throws IOException{
		Lexeme l = null;
		/*
		 * 第一次处理文本的时候才会进while把整个文本处理一变，
		 * 后来getNextLexeme可以从return获取到lexeme对象，直接输出
		 * lexeme是没有lexemeText的，在getNextLexeme中生成
		 */
		while((l = context.getNextLexeme()) == null ){
			/*
			 * 从reader中读取数据，填充buffer
			 * 如果reader是分次读入buffer的，那么buffer要  进行移位处理
			 * 移位处理上次读入的但未处理的数据
			 */
			// 初始化文本指针，指向文本中的第一个字符
			int available = context.fillBuffer(this.input);
			if(available <= 0){
				//reader已经读完
				context.reset();
				return null;
				
			}else{
				//初始化指针
				context.initCursor();
				do{
					/*
					 * 遍历分词器，进行分词处理，这里是最核心的流程之一，将待匹配文本生成分词候选集。
					 * 总共有三种分词器CJKSegmenter(中文分词器)、CN_QuantifierSegment(数量词分词器)、
					 * LetterSegment(字母数字分词器)，每种分词器的分词方法是独立的，
					 * 各自生成自己的分词结果，放到分词候选集里
					 * 进去的顺序是 LetterSegment,CN_QuantifierSegment,CJKSegmenter
					 */
        			for(ISegmenter segmenter : segmenters){
        				segmenter.analyze(context);
        			}
        			//字符缓冲区接近读完，需要读入新的字符
        			if(context.needRefillBuffer()){
        				break;
        			}
   				// 向前移动指针
        		// 处理完一个字符之后，文本指针后移一位，直到处理完所有待匹配文本
				}while(context.moveCursor());
				//重置子分词器，为下轮循环进行初始化
				for(ISegmenter segmenter : segmenters){
					segmenter.reset();
				}
			}
			/*
			 * 对分词进行歧义处理
			 * 在orgLexemes中存储了所有的切分 
			 * 经过这个函数orgLexemes为空
			 */
			this.arbitrator.process(context, this.cfg.useSmart());	
			/*
			 * 将分词结果输出到结果集
			 * 并处理未切分的单个CJK字符
			 * 经过这一步results里面才有数据
			 */
			context.outputToResult();
			/*
			 * 自己加入的代码，把数词和量词结合起来，加入max模式
			 * 如:2012年
			 */
			context.ljbCombineNumWords(this.cfg.useSmart());
			//记录本次分词的缓冲区位移
			context.markBufferOffset();			
		}
		return l;
	}

	/**
     * 重置分词器到初始状态
     * @param input
     */
	public synchronized void reset(Reader input) {
		this.input = input;
		context.reset();
		for(ISegmenter segmenter : segmenters){
			segmenter.reset();
		}
	}
}

package org.wltea.analyzer.test;

import java.io.IOException;
import java.io.StringReader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;

/*
 * 作者:Lijianbo
 * 日期:2016年5月11日:下午5:42:28
 * 程序作用:
**/
public class AlalyzerSmartTest {

	  public static void main(String[] args) throws IOException {  
	        String text="湖北中烟工业有限责任公司是一个地方";  
	        //创建分词对象  
	        Analyzer anal=new IKAnalyzer(true);       
	        StringReader reader=new StringReader(text);  
	        //分词  
	        TokenStream ts=anal.tokenStream("", reader);  
	        CharTermAttribute term=ts.getAttribute(CharTermAttribute.class); 
	        // lucene4.6以上必须加上这一行
	        ts.reset();
	        //遍历分词数据  
	        while(ts.incrementToken()){  
	            System.out.print(term.toString()+"|");  
	        }  
	        reader.close();  
	        System.out.println();  
	    }  

}

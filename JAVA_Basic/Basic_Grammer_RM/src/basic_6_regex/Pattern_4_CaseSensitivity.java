package basic_6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Author:Lijianbo
 * date:2016年4月28日
 * time:下午2:52:04
**/
public class Pattern_4_CaseSensitivity {

	public static void main(String[] args) {
		// 忽略大小写
		Pattern pattern=Pattern.compile("java",Pattern.CASE_INSENSITIVE);
		String str="java jaVA JAVA";
		Matcher matcher=pattern.matcher(str);		
		// 全部替换
		String str2=matcher.replaceAll("JAVA");
		System.out.println(str2);
		// 边找边替换
		StringBuffer buf=new StringBuffer();
		matcher.reset();
		while(matcher.find()){
			// 往buf里面添加
			matcher.appendReplacement(buf, "java");
		}
		// 最后加入尾巴
		matcher.appendTail(buf);
	}

}

package baisc_zhengzhe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Author:Lijianbo
 * date:2016年4月28日
 * time:下午2:28:06
**/
public class Pattern_2_Group {
	
	public static void main(String[] args) {
		String str="123456789";
		// 括号里面为分组
		Pattern pattern=Pattern.compile("(\\d{3})(\\d{3})(\\d{3})");
		Matcher matcher=pattern.matcher(str);
		while(matcher.find()){
			// 123456789 0下标是整个组
			System.out.println(matcher.group(0));
			// 123
			System.out.println(matcher.group(1));
			// 456
			System.out.println(matcher.group(2));
			// 789
			System.out.println(matcher.group(3));
		}
		

	}

}

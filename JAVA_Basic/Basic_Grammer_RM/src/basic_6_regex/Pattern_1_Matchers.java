package basic_6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 作者:Lijianbo
 * 日期:2016年5月20日:下午1:52:45
 * 程序作用:
 * matchers 完全匹配整个字符串
**/
public class Pattern_1_Matchers {

	public static void main(String[] args) {
		/*
		 * Pattern要结合matcher使用
		 * 编译能够提高效率，不用用一次编译一次
		 */
		// 把complie(中的正则)编译成一个Pattern
		Pattern pattern = Pattern.compile("\\d+");
		/*
		 * matches整个字符串是否完全匹配正则表达式,指针会移动,
		 * 如果不完全匹配,会到不匹配的第一个字符停下来
		 * matches后面可以直接加正则表达式 
		 */
		Matcher matcher = pattern.matcher("23334gggg");
		System.out.println(matcher.matches());// false
		// 重置指针 让指针指向开头
		matcher.reset();



	}

}

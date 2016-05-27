package baisc_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 作者:Lijianbo
 * 日期:2016年5月20日:下午1:52:45
 * 程序作用:
 * matcher find 从字符串中找到符合正则的子串
**/
public class Pattern_1_Find {

	public static void main(String[] args) {
		/*
		 * Pattern要结合matcher使用
		 * 编译能够提高效率，不用用一次编译一次
		 */
		// 把complie(中的正则)编译成一个Pattern
		Pattern pattern = Pattern.compile("\\d+");
		/*
		 * pattern要结合matcher使用
		 * matcher里面有大量有用的信息
		 */
		Matcher matcher = pattern.matcher("23334gggg");
		// 重置指针 让指针指向开头
		matcher.reset();
		/*
		 * find一次指针会移到末尾,
		 * 再次调用find会继续向后查找一位
		 * group
		 */
		while (matcher.find()) {// 查找到匹配
			System.out.println(matcher.group());
			// 当次寻找开始和结束的下标
			System.out.println(matcher.start());
			System.out.println(matcher.end());
		}

	}

}

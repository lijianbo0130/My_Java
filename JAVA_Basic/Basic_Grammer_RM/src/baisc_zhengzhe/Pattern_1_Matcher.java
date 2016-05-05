package baisc_zhengzhe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Author:Lijianbo
 * date:2016年4月22日
 * time:上午10:53:45
**/
public class Pattern_1_Matcher {

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
		Matcher matcher = pattern.matcher("2333f2444f");

		/* 
		 * matchers完全匹配,指针会移动,
		 * 如果不匹配会到不匹配的第一个字符停下来
		 */
		System.out.println(matcher.matches());// false
		// 重置指针 让指针指向开头
		matcher.reset();
		/*
		 * find一次指针会移到末尾,
		 * 再次调用find会继续向后查找
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

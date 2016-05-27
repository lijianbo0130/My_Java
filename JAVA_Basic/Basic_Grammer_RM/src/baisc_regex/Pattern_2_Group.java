package baisc_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 作者:Lijianbo
 * 日期:2016年5月20日:下午1:52:45
 * 程序作用:
 * group 分组匹配 小括号里面的会重新匹配 左小括号就是组的num
**/
public class Pattern_2_Group {

	public static void main(String[] args) {
		String str = "123aa-456bb-789cc";
		// 括号里面为分组
		Pattern pattern = Pattern.compile("(\\d{3})[a-z]{2}");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			// 123aa 0下标是整个组
			System.out.println(matcher.group(0));
			// 123 小括号里面的123
			System.out.println(matcher.group(1));

		}

	}

}

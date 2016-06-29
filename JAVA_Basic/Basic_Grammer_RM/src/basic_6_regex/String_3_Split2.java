package basic_6_regex;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 作者:Lijianbo
 * 日期:2016年5月20日:下午1:52:45
 * 程序作用:
 * split保留分隔符
**/
public class String_3_Split2 {

	/**
	 * 用途说明：
	 * @param regex 正则表达式
	 * @param str 待分割的文本
	 * @return
	 */
	public List<String> splitMy(String regex, String str) {
		/*
		 * 按正则分割，同时保留分隔符
		 */

		List<String> termList = new LinkedList<String>();

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int begin = 0;
		int end;
		while (matcher.find()) {
			end = matcher.start();
			// 去除 [, 123, ddd, 456, ddd, 789, dd] 这种情况
			if (begin != end) {
				termList.add(str.substring(begin, end));
			}

			termList.add(str.substring(matcher.start(), matcher.end()));
			// termList.add(new Term(matcher.group(), Nature.xu));
			begin = matcher.end();
		}
		if (begin < str.length()) {
			termList.add(str.substring(begin, str.length()));
		}
		return termList;

	}

	/**
	 * 用途说明：
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * 把句子按数字分割
		 */
		String str = "123ddd456ddd789dd123";
		String regex = "\\d+";
		String_3_Split2 split2 = new String_3_Split2();
		List<String> splitMy = split2.splitMy(regex, str);
		System.out.println(splitMy.toString());

	}

}

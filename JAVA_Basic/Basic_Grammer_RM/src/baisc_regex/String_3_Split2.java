package baisc_regex;

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

	public List<String> splitMy(String regex, String objStr) {
		/*
		 * 按正则分割，同时保留分隔符
		 */

		List<String> termList = new LinkedList<String>();

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(objStr);
		int begin = 0;
		int end;
		while (matcher.find()) {
			end = matcher.start();
			termList.add(objStr.substring(begin, end));
			termList.add(objStr.substring(matcher.start(), matcher.end()));
			// termList.add(new Term(matcher.group(), Nature.xu));
			begin = matcher.end();
		}
		if (begin < objStr.length()) {
			termList.add(objStr.substring(begin, objStr.length()));
		}
		return termList;
		// System.out.println(termList.toString());

	}

	/**
	 * 用途说明：
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * 把句子按!分割
		 */
		String str = "Kevin has seen !seveal times,because ! film!ssssssss";
		String regex = "!";
		String_3_Split2 split2 = new String_3_Split2();
		List<String> splitMy = split2.splitMy(regex, str);
		System.out.println(splitMy.toString());
		/*
		 * URL
		 */
		str = "sen==13) {window.location='http://www.yuanan.org/news/index.php?page=   " + "www.baidu.com'}";
		regex = "((?:https?|ftp|file)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]*[-A-Za-z0-9+&@#/%=~_|])";
		splitMy = split2.splitMy(regex, str);
		System.out.println(splitMy.toString());

	}

}


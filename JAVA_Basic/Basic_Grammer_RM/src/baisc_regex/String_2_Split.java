package baisc_regex;

import java.util.regex.Pattern;

/*
 * 作者:Lijianbo
 * 日期:2016年5月20日:下午1:52:45
 * 程序作用:
 * split基本
**/
public class String_2_Split {

	public static void main(String[] args) {
		/*
		 * String可以直接使用 
		 * 不使用pattern
		 */
		
		
		// 把句子按!分割
		String str = "Kevin has seen !seveal times,because ! film!";
		String[] result = str.split("(!)",-1);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		// 编译后使用
		Pattern pattern = Pattern.compile("(!)");
		result=pattern.split(str);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}

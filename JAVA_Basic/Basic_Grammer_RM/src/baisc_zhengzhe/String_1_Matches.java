package baisc_zhengzhe;

/*
 * Author:Lijianbo
 * date:2016年4月28日
 * time:上午11:24:15
**/
public class String_1_Matches {
	public static void main(String[] args) {
		/*
		 * 完全匹配
		 * matches整个字符串是否完全匹配正则表达式
		 * matches后面直接加正则表达式 
		 */
		System.out.println("a123".matches("\\d"));
		System.out.println("a".matches("."));
		System.out.println("aa".matches(".a"));
		// Java两个\\ 才表示一个\
		System.out.println("\\");// \
		System.out.println("123".matches("\\d"));// false \\d是一个数字
		System.out.println("aa".matches(".a"));

	}

}

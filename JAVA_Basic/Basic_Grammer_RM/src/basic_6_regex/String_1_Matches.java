package basic_6_regex;

/*
 * 作者:Lijianbo
 * 日期:2016年5月20日:下午1:52:45
 * 程序作用:
 * matches 字符串是否完全匹配正则
**/
public class String_1_Matches {
	public static void main(String[] args) {

		/*
		 * matches整个字符串是否完全匹配正则表达式,指针会移动,
		 * 如果不完全匹配,会到不匹配的第一个字符停下来
		 * matches后面可以直接加正则表达式 
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

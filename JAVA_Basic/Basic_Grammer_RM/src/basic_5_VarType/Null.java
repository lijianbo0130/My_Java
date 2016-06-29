package basic_5_VarType;

/*
 * 作者:Lijianbo
 * 日期:2016年5月23日:上午11:43:53
 * 程序作用:
**/
public class Null {

	public static void main(String[] args) {
		// java 判断空
		String str = null;
		System.out.println(str == null);
		// String的 ""不为空
		String str2 = "";
		System.out.println(str == "");
		// 判断str为空的写法
		if (str == null || str.equals("")) {

		}
	}

}

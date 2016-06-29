package basic_5_VarType;

/*
 * 作者:Lijianbo
 * 日期:2016年5月31日:下午4:14:33
 * 程序作用:
**/
public class StringDemo {
	public static void main(String[] args) {
		/*
		 * 得到String的子串
		 */
		String str3 = "avc";
		String str4 = str3.substring(0, 1);
		// a 0,1表示的是第一个字符
		System.out.println(str4);
		/*
		 * 去除换行啥的
		 */
		str3="aaa   \t";
		System.out.println(str3.trim()+"1");
	}

}

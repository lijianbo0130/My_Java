package baisc_zhengzhe;
/*
 * Author:Lijianbo
 * date:2016年4月28日
 * time:下午2:18:55
**/
public class String_3_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="55554bb";
		// 第一个是正则,第二个是替换成什么
		String newStr=string.replaceAll("\\d+", "w");
		System.out.println(newStr);
		// 原来的字符不变
		System.out.println(string);

	}

}

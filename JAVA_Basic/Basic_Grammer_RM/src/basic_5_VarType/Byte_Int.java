package basic_5_VarType;

/*
 * 作者:Lijianbo
 * 日期:2016年6月3日:下午4:01:31
 * 程序作用:
 * 介绍char和int的转换
 * char 汉字都可以转换为int
**/
public class Byte_Int {

	public static void main(String[] args) {
		// char-> int
		char a = 'b';
		char b = '我';
		int i = (int) a;
		System.out.println(i);
		i = (int) b;
		System.out.println(i);
		// int->char
		int s=25105;
		char ss=(char)s;
		System.out.println(ss);// 我
		
	}

}

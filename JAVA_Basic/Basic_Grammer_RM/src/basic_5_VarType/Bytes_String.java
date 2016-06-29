package basic_5_VarType;

/*
 * 作者:Lijianbo
 * 日期:2016年5月30日:下午2:37:42
 * 程序作用: 把string转换为bytes 传输的时候使用
**/
public class Bytes_String {

	public static void main(String[] args) {
		
		String str = "aaa";
		// String 转化为bytes
		byte[] bytes = str.getBytes();
		System.out.println(bytes);
		// byte转String
		String string=new String(bytes, 0, bytes.length);
		System.out.println(string);
		

	}

}

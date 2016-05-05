package basic_Io;
import java.io.*;

public class File_demo {

	public static void main(String[] args) {
		/*
		 * java里面只能用 python也是一样
		 * D:/daima2/basic_grammer/src/io/test.txt
		 * 不能用
		 * \这种斜杠
		 */
		/*
		 * 通过路径创建一个File对象 不存在会创建
		 * 存在会覆盖 有点危险
		 */
		File file=new File("D:/daima2/basic_grammer/src/io/test.txt");
		File file2=new File("src/io/test2.txt");
		// file.createNewFile();  创建文件 需要try catch
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 输出绝对路径
		System.out.println("输出绝对路径 "+file.getAbsolutePath());
		// 输出字节大小
		System.out.println("输出绝对路径 "+file.length());
		// 文件是否存在
		System.out.println(file.exists());
		
		// file.isDorectpry() 是否是文件夹
		// file.listFiles()得到文件夹下面的所有文件
	}

}

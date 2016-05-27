package basic_Io.dir;

import java.io.File;
import java.io.IOException;

/*
 * 作者:Lijianbo
 * 日期:2016年5月24日:上午10:52:22
 * 程序作用:创建文件和创建文件夹
**/
public class Dir_2_Create {

	public static void main(String[] args) {
		// 创建文件
		File file = new File("b.txt");
		// 判断是否存在
		if (file.exists()) {
			System.out.println("文件已经存在");
		} else {// 不存在就创建
			try {
				// 创建文件
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 创建文件夹
		file = new File("testFile");
		if (file.isDirectory()) {
			System.out.println("文件夹存在");
		} else {
			// 创建
			file.mkdir();
		}

	}

}

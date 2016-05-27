package basic_Io.dir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 作者:Lijianbo
 * 日期:2016年5月24日:上午9:54:56
 * 程序作用:java相对路径是从工程目录的根目录查找
**/
public class Dir_1_Basic_Info {

	public static void main(String[] args) {
		// 从工程目录下得到a.txt文件
		File file = new File("a.txt");
		File file2 = new File("c:/a.txt");
		System.out.println("输出绝对路径 " + file.getAbsolutePath());
		System.out.println("文件大小 " + file.length());
		System.out.println("是否可读 " + file.canRead());
		System.out.println("文件名为 " + file.getName());
		System.out.println("最后一次修改时间 " + file.lastModified());
		System.out.println("newFile里面写的什么就得到什么 " + file2.getPath());
	}

}

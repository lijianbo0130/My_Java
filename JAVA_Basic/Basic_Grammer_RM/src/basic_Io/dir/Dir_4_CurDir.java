package basic_Io.dir;

import java.io.File;
import java.io.IOException;

/*
 * 作者:Lijianbo
 * 日期:2016年5月24日:上午10:42:39
 * 程序作用:
**/
public class Dir_4_CurDir {
	public void show() {
		File directory = new File("");// 设定为当前文件夹
		System.out.println(directory.getAbsolutePath());// 获取绝对路径
	}

	public static void main(String[] args) {
		// 这个是相对路径 意义不大
		File directory = new File("");// 设定为当前文件夹
		System.out.println(directory.getAbsolutePath());// 获取绝对路径

	}

}

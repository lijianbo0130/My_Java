package basic_Io.dir;

import java.net.URL;

/*
 * 作者:Lijianbo
 * 日期:2016年5月24日:上午10:24:50
 * 程序作用:
 * 打包的时候如何查找配置文件
 * 这个getResource打包和不打包路径是不一样的
 * 打包.calss根目录为jar包的根目录
 * 不打包的根目录为.class文件的根目录
 * getResource 是按.class文件的路径来算的
 * 问题：jar包里面的文件不能用这个函数读取
 * 只能用asStream
 * 
**/
public class Dir_3_GetResource {

	public void show() {
		// 得到.class的根目录 Basic_Grammer_RM/bin/ 一般为包名的根目录
		String rootPath = getClass().getResource("/").getFile().toString();
		System.out.println(rootPath);
		// 当前文件的文件夹 Basic_Grammer_RM/bin/basic_Io/dir/
		String currentPath1 = getClass().getResource(".").getFile().toString();
		System.out.println(currentPath1);
		// 当前文件的文件夹 Basic_Grammer_RM/bin/basic_Io/dir/
		String currentPath2 = getClass().getResource("").getFile().toString();
		System.out.println(currentPath2);
		// 当前目录的上级目录路径 Basic_Grammer_RM/bin/basic_Io/
		String parentPath = getClass().getResource("../").getFile().toString();
		System.out.println(parentPath);
		// 当前目录的上级目录路径 Basic_Grammer_RM/bin/basic_Io/
		parentPath = getClass().getResource("../../").getFile().toString();
		System.out.println(parentPath);
	}

	public void getTwoWat() {
		// 可以使用对象调用getResource
		Dir_3_GetResource dir_3_GetResource = new Dir_3_GetResource();
		URL resource = dir_3_GetResource.getClass().getResource("a.txt");
		System.out.println(resource);
		// 也可以使用类
		URL resource2 = Dir_3_GetResource.class.getResource("a.txt");
		System.out.println(resource2);

	}

	public static void main(String[] args) {
		Dir_3_GetResource curDir = new Dir_3_GetResource();
//		curDir.show();
		curDir.getTwoWat();
	}

}

package basic_4_Io.dir;

import java.io.IOException;
import java.net.URL;

import javax.annotation.Resource;

/*
 * 作者:Lijianbo
 * 日期:2016年5月25日:上午10:25:35
 * 程序作用:
**/
public class Dir_5_AbsDir {
	public void getResource() throws IOException {
		// getResource a.txt是当前文件夹下
		URL fileURL = this.getClass().getResource("a.txt");
		System.out.println(fileURL.getFile());
		URL fileURL2 = this.getClass().getResource("/resource/a.txt");
		System.out.println(fileURL2.getFile());
	}

	public static void main(String[] args) throws IOException {
		Dir_5_AbsDir res = new Dir_5_AbsDir();
		res.getResource();
	}

}

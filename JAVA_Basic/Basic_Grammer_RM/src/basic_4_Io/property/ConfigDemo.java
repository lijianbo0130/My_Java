package basic_4_Io.property;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

/*
 * 作者:Lijianbo
 * 日期:2016年5月24日:上午10:24:50
 * 程序作用: 
 * 读取配置文件标准流程
 * 
 * 
**/
public class ConfigDemo {

	public static void main(String[] args) {
		/*
		 * 使用peoperty 类来读取配置文件
		 * 配置文件key=value
		 * 如：fileDir=d:\\a.txt
		 */
		// 

		try {
			// 得到文件的InputStream 对象
			InputStream resourceAsStream = ConfigDemo.class.getResourceAsStream("/my.property");
			// 生成Properties对象
			Properties properties = new Properties();
			// 读取配置文件
			properties.load(resourceAsStream);
			// 得到一个属性
			String property = properties.getProperty("fileDir");
			System.out.println(property);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

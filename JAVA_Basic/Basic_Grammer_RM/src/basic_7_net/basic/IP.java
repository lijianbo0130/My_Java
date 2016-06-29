package basic_7_net.basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 作者:Lijianbo
 * 日期:2016年5月30日:上午11:51:43
 * 程序作用:
**/
public class IP {

	public static void main(String[] args) {
		try {
			// 获得本地ip
			InetAddress ip = InetAddress.getLocalHost();
			// 通过名字得到ip 通过域名
			ip = InetAddress.getByName("www.baidu.com");
			// 域名 asus-pc-PC
			System.out.println(ip.getHostName());
			// 本地 输出ip地址
			System.out.println(ip.getHostAddress());

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

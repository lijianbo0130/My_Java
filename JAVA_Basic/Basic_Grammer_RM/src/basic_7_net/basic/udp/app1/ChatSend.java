package basic_7_net.basic.udp.app1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * 作者:Lijianbo
 * 日期:2016年5月30日:下午2:25:37
 * 程序作用: 发送给接收端
**/
public class ChatSend {

	public static void main(String[] args) {
		try {
			/*
			 * 过程总结
			 * 创建 DatagramSocket对象
			 * 数据打包成 DatagramPacket对象
			 * 发送 DatagramSocket对象的send方法
			 */
			System.out.println("发送端启动");
			// 建立udp socket服务
			DatagramSocket socket = new DatagramSocket();
			// 从键盘读取信息
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				// 等于over就退出
				if ("over".equals(line)) {
					break;
				}
				byte[] bs = line.getBytes();
				// 得到ip
				InetAddress localHost = InetAddress.getLocalHost();
				// 创建数据包 封装数据
				DatagramPacket packet = new DatagramPacket(bs, bs.length, localHost, 10000);

				// 发送封装的数据包
				socket.send(packet);

			}

			// 关闭
			socket.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * 发送
		 */

	}

}

package basic_7_net.basic.udp.basic;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * 作者:Lijianbo
 * 日期:2016年5月30日:下午2:25:37
 * 程序作用:UDP接收端 先启动
**/
public class UdpReceive {

	public static void main(String[] args) {
		try {
			/*
			 * 过程总结
			 * 创建 DatagramSocket对象
			 * 创建数据包 用来接受数据 DatagramPacket对象
			 * 接受 DatagramSocket对象的receive方法
			 * 解析
			 */
			System.out.println("接收端启动");
			// 建立udp socket服务 端口
			DatagramSocket socket = new DatagramSocket(10000);
			// 创建一个数据包
			byte[] bs = new byte[1024];
			DatagramPacket packet = new DatagramPacket(bs, bs.length);
			// 接受数据包
			socket.receive(packet);
			// 解析
			// Ip对象
			InetAddress address = packet.getAddress();
			// 得到数据
			String str = new String(packet.getData(),0,packet.getLength());
			System.out.println(str);
			// 关闭
			socket.close();
		} catch (SocketException e) {
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

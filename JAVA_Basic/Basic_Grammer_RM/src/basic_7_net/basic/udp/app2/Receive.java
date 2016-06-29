package basic_7_net.basic.udp.app2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * 作者:Lijianbo
 * 日期:2016年5月30日:下午5:09:51
 * 程序作用:
**/
public class Receive implements Runnable {

	// 数据对象
	private DatagramSocket socket;

	public Receive(DatagramSocket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			while (true) {
				// 创建一个数据包
				byte[] bs = new byte[1024];
				DatagramPacket packet = new DatagramPacket(bs, bs.length);
				// 接受数据包
				socket.receive(packet);
				// 得到数据
				String str = new String(packet.getData(), 0, packet.getLength());
				System.out.println(str);
			}
			// 关闭
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

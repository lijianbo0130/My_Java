package basic_7_net.basic.udp.app2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 作者:Lijianbo
 * 日期:2016年5月30日:下午5:07:50
 * 程序作用:
**/
public class Send implements Runnable {

	// 数据对象
	private DatagramSocket socket;

	public Send(DatagramSocket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			// 从键盘读取
			while ((line = bufferedReader.readLine()) != null) {
				// 等于over就退出
				if ("over".equals(line)) {
					break;
				}
				byte[] bs = line.getBytes();
				// 得到ip
				InetAddress localHost = InetAddress.getLocalHost();
				// 创建数据包 封装数据
				DatagramPacket packet = new DatagramPacket(bs, bs.length, localHost, 10001);
				// 发送封装的数据包
				socket.send(packet);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

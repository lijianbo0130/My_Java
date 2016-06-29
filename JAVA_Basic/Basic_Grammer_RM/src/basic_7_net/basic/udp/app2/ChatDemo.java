package basic_7_net.basic.udp.app2;

import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * 作者:Lijianbo
 * 日期:2016年5月30日:下午5:18:17
 * 程序作用:
**/
public class ChatDemo {

	public static void main(String[] args) {
		;
		try {
			// 新建两个对象
			DatagramSocket sendScoket = new DatagramSocket();
			DatagramSocket receiveScoket = new DatagramSocket(10001);
			Send send = new Send(sendScoket);
			Receive receive = new Receive(receiveScoket);
			//  启动线程
			new Thread(receive).start();
			new Thread(send).start();
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

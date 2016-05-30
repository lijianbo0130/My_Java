package advance_inter_net;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 作者:Lijianbo
 * 日期:2016年5月27日:下午6:19:54
 * 程序作用:
**/
public class TCPClient {

	public static void main(String[] args) {
		
		try {
			// IP 端口号
			Socket socket = new Socket("127.0.0.1", 6666);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

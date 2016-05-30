package advance_inter_net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 作者:Lijianbo
 * 日期:2016年5月27日:下午6:19:26
 * 程序作用:首先启动server
**/
public class TCPServer {

	public static void main(String[] args) {
		
		try {
			// 端口号
			ServerSocket serverSocket=new ServerSocket(6666);
			// 返回接受的Socket 建立一次连接
			Socket accept = serverSocket.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

}

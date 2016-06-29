package basic_7_net.basic.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
			// 通过管道得到流输出String
			OutputStream outputStream = socket.getOutputStream();
			DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
			// 传输String 这个writeUTF 也是阻塞式的。等待的过程中其他客户端无法连接
			dataOutputStream.writeUTF("客户端发送语句");
			dataOutputStream.flush();
			// 关闭
			dataOutputStream.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

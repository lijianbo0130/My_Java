package basic_7_net.basic.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 作者:Lijianbo
 * 日期:2016年5月27日:下午6:19:26
 * 程序作用:首先启动server
 * 这个是同步的,都是等待，异步的才是最好的。
**/
public class TCPServer {

	public static void main(String[] args) {

		try {
			System.out.println("服务端启动");
			// 端口号
			ServerSocket serverSocket = new ServerSocket(6666);
			/*
			 * 是阻塞模式
			 * 返回接受的Socket 建立一次连接 得到Socket对象
			 * 写成死循环,这样可以接受所有的连接
			 */
			while (true) {
				Socket accept = serverSocket.accept();
				System.out.println("一个客户端链接");
				// 接受客户端的传输
				DataInputStream inputStream = new DataInputStream(accept.getInputStream());
				// 输出
				System.out.println(inputStream.readUTF());
				// 关闭
				inputStream.close();
				accept.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

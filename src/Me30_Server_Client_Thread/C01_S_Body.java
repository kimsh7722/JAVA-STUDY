package Me30_Server_Client_Thread;

import java.net.ServerSocket;
import java.net.Socket;

public class C01_S_Body {

	public static void main(String[] args) {
		
		
		try {
		// Server 생성
		ServerSocket server = new ServerSocket(8585);
		System.out.println("Server 서비스 실행...");
		
		// Client 연결 생성
		Socket slient = server.accept();
		System.out.println(slient.getInetAddress()+"에서 접속!");
		
		// 송신,수신 Thread
		C01_S_Recv_Thread_수신 recv = new C01_S_Recv_Thread_수신(slient);
		C01_S_Send_Thread_보내기 send = new C01_S_Send_Thread_보내기(slient);
		Thread th1 = new Thread(recv);
		Thread th2 = new Thread(send);
		
		// Thread 실행
		th1.start(); th2.start();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

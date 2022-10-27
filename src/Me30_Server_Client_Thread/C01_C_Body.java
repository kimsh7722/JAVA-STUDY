package Me30_Server_Client_Thread;

import java.net.ServerSocket;
import java.net.Socket;

public class C01_C_Body {

	public static void main(String[] args) {
		
		try {
			// 접속자 Client 생성
			Socket client = new Socket("192.168.3.4",8585);
			
			// 송신,수신 Thread
			C01_C_Recv_Thread_수신 recv = new C01_C_Recv_Thread_수신(client);
			C01_C_Snd_Thread_보내기 send = new C01_C_Snd_Thread_보내기(client);
			Thread th1 = new Thread(recv);
			Thread th2 = new Thread(send);
			
			// Thread 실행
			th1.start(); th2.start();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}

}

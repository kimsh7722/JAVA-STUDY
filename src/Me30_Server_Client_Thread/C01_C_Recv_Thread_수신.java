package Me30_Server_Client_Thread;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class C01_C_Recv_Thread_수신 implements Runnable{

	Socket client;
	DataInputStream cin;
	
	public C01_C_Recv_Thread_수신(Socket client) {
		this.client=client;
	}
	
	
	
	@Override
	public void run() {
		
		try {
			// datainput함수안에 client안의 input가져와서 담아라
			cin=new DataInputStream(client.getInputStream());
			
			// 수신생성
			String recv;
			
			while(true) {
				// slient의 전달 메시지를 수신
				recv = cin.readUTF();
				if(recv == null || recv.equals("q")) {
					System.out.println("Client 수신 프로그램 종료");
					System.exit(-1);
				}
				System.out.println("\r[SERVER] : "+recv);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package Me30_Server_Client_Thread;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class C01_S_Recv_Thread_수신 implements Runnable{

	Socket slient;
	DataInputStream sin;
	
	public C01_S_Recv_Thread_수신(Socket client) {
		this.slient=client;
	}
	
	
	
	@Override
	public void run() {
		
		try {
			// datainput함수안에 client안의 input가져와서 담아라
			sin=new DataInputStream(slient.getInputStream());
			
			// 수신생성
			String recv;
			
			while(true) {
				// client의 전달 메시지를 수신
				recv = sin.readUTF();
				if(recv == null || recv.equals("q")) {
					System.out.println("Server 수신 프로그램 종료");
					System.exit(-1);
				}
				System.out.println("\r[Client] : "+recv);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

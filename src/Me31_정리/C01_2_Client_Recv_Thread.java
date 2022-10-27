package Me31_정리;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class C01_2_Client_Recv_Thread implements Runnable{

	Socket client;
	DataInputStream cin;
	ClientUI cui;
	
	public C01_2_Client_Recv_Thread(Socket client,ClientUI cui) {
		this.client=client;
		this.cui=cui;
	}
	
	
	
	@Override
	public void run() {
		
		try {
			// InputStream
			cin=new DataInputStream(client.getInputStream());
			
			// 수신생성
			String recv;
			
			while(true) {
				// client의 전달 메시지를 수신
				recv = cin.readUTF();
				if(recv == null || recv.equals("q")) {
					cui.area.append("Server 수신 프로그램 종료");
					System.exit(-1);
				}
				cui.area.append("\r[ Client ] : "+recv);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

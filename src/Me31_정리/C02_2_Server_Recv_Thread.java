package Me31_정리;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class C02_2_Server_Recv_Thread implements Runnable{

	Socket slient;
	DataInputStream sin;
	ServerUI sui;
	
	public C02_2_Server_Recv_Thread(Socket client,ServerUI sui) {
		this.slient=client;
		this.sui=sui;
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
					sui.area.append("Client 수신 프로그램 종료");
					System.exit(-1);
				}
				System.out.println("\r[ Client ] : "+recv);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

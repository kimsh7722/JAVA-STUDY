package Me28_1_Socket_통신;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class C01_2_Socket_Client {

	public static void main(String[] args) {

		try {
		// Client의 주소 담을 소켓   ┌ Server IP,Port
		Socket client = new Socket("192.168.3.6",7070);
		
		// ??? 들어오는 함수생성
		InputStream in = client.getInputStream();
		// ??? 데이터를 받을 함수 생성후 in을 적용
		DataInputStream inData = new DataInputStream(in);
		
		System.out.println("------- 서버 메시지 Start -------");
		System.out.println(inData.readUTF()+"\n");
		System.out.println("------- 서버 메시지 End -------");
		System.out.println("192.168.3.4 Client가 Server에 접근였습니다");
		client.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

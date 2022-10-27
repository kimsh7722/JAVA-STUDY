package Me28_1_Socket_통신;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01_1_Socket_Server {

	public static void main(String[] args) {
		
		try {
		// 서버 Port
		ServerSocket server = new ServerSocket(4545); 
		System.out.println("Server Start!!");
		// Client가 Server 통신할수있게 하는 함수를 소켓에 담다
		Socket client = server.accept();
		
		// 밬으로 내보낼 함수
		OutputStream out = client.getOutputStream();
		// Data나갈수있는 함수
		DataOutputStream Dout = new DataOutputStream(out);
		Dout.writeUTF("Server접속이 확인되었습니다");
		Dout.flush();
		server.close();
		client.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

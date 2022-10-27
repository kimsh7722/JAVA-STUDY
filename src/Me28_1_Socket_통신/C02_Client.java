package Me28_1_Socket_통신;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02_Client {

	public static void main(String[] args) throws Exception {
		
		try {
		Socket client = new Socket("192.168.3.4",7654);
		System.out.println("서버와 연결이 완료되었습니다");
		DataInputStream Din = new DataInputStream(client.getInputStream());
		DataOutputStream Dout = new DataOutputStream(client.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		String recv=null;
		String send=null;
		
		while(true)
		{
			System.out.print("[Client] : ");
			send=sc.nextLine();
			System.out.println("[Server 보낼 정보] : "+send);
			Dout.writeUTF(send);
			Dout.flush();
			System.out.print("[Client (q:종료)] : " );
			if(send.equals("q")) {
				break;
			}
			recv=Din.readUTF();
			System.out.print("[Server ] : "+ recv);	
			if(recv.equals("q")) {
				break;
			}
		}
		
		Dout.close();
		Din.close();
		client.close();
		System.out.println("서버와 연결을 종료합니다");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

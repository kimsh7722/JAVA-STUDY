package Me28_1_Socket_통신;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02_Server_이용 {

	
	public static void main(String[] args) throws Exception{

		ServerSocket server = null;
		InputStream in = null;
		DataInputStream out = null;
		try {
		server = new ServerSocket(7654);
		System.out.println("Server Started...");
		Socket client = server.accept();
		DataInputStream din = new DataInputStream(client.getInputStream());
		DataOutputStream dout = new DataOutputStream(client.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		String recv = null;
		String send = null;
			while(true) {
				recv = din.readUTF();
				if(recv.equals("q")) {
					break;
				}
				System.out.println("[Client] : "+recv);
				System.out.print("[Server[q:종료] : ");
				send=sc.nextLine();
				dout.writeUTF(send);
				dout.flush();
				if(send.equals("q")) {
					break;
				}
			}
		dout.close();
		din.close();
		client.close(); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

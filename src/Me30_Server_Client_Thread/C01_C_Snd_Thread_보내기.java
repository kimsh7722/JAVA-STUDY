package Me30_Server_Client_Thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class C01_C_Snd_Thread_보내기 implements Runnable{

	Socket client;
	DataOutputStream cout;
	Scanner sc=new Scanner(System.in);
	
	public C01_C_Snd_Thread_보내기(Socket client) {
		this.client=client;
	}

	@Override
	public void run() {

		try {
			cout = new DataOutputStream(client.getOutputStream());
			String send;
		
			while(true)	{
				System.out.print("[Client] : ");
				send = sc.nextLine();
				cout.writeUTF(send);
				if(send == null || send.equals("q")) {
					System.out.println("Client 보내기 프로그램 종료");
					System.exit(-1);
				}
				cout.flush();
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

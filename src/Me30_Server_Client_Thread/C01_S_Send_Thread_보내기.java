package Me30_Server_Client_Thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class C01_S_Send_Thread_보내기 implements Runnable{

	Socket slient;
	DataOutputStream sout;
	Scanner sc=new Scanner(System.in);
	
	public C01_S_Send_Thread_보내기(Socket client) {
		this.slient=client;
	}

	@Override
	public void run() {

		try {
			sout = new DataOutputStream(slient.getOutputStream());
			String send;
		
			while(true)	{
				System.out.print("[SERVER] : ");
				send = sc.nextLine();
				sout.writeUTF(send);
				if(send == null || send.equals("q")) {
					System.out.println("Server 보내기 프로그램 종료");
					System.exit(-1);
				}
				sout.flush();
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

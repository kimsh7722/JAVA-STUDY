package Me31_정리;

import java.awt.Color;
import java.awt.event.ActionEvent;
// 이벤트 활성화 함수 
import java.awt.event.ActionListener;
// 키보드 이벤트 활성화
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ServerUI extends JFrame implements ActionListener,KeyListener{
	
	// 전역변수
	JTextArea area; JPanel panel;
	JScrollPane scroll; JTextField txt1;
	JButton btn1; JButton btn2;
	JButton btn3; JButton btn4;
	
	// Server 생성
	Socket slient;
	ServerSocket serket;
	
	ServerUI(){
		super("Server Body 입니다");
		
		// 필드-패널 생성
		panel = new JPanel(); 
		panel.setLayout(null);
		
		// 택스트 Area 생성
		area = new JTextArea();
		area.setBounds(10,10,150,100);
		area.setEditable(false);
		
		// 스크롤 추가
		scroll = new JScrollPane(area);
		scroll.setBounds(10,10,250,250);
		
		
		
		// text필드
		txt1 = new JTextField();
		txt1.setBounds(10,270,250,30);
		// key이벤트를 txt로 적용
		txt1.addKeyListener(this);

		// 배격색 지정
		Color col = new Color(250,200,180);
		panel.setBackground(col);
		setResizable(false); // 레이아웃삭제
		
		// 패널 추가
		add(panel); panel.add(txt1);
		panel.add(scroll);
		
		// 프론트 엔트 영역=div
		setBounds(100,100,300,400); // x,y,weight,height
		// 완전끄기 설정안하면 process가 계속 돌아간다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		// visible : 보여라
		setVisible(true);
		
		
		
		// Server 생성시작
		try {
			// 생성
			serket = new ServerSocket(5656);
			// 연결
			slient = serket.accept();
			
			// Thread 송,수신 수행
			C02_2_Server_Recv_Thread recv = new C02_2_Server_Recv_Thread(slient,this);
			
			// Thread 생성
			Thread th1 = new Thread(recv);
			
			// 실행
			th1.start();
			area.append(slient.getInetAddress()+"에서 접속\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 이벤트 활성화
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	// Key 이벤트
	@Override
	public void keyTyped(KeyEvent e) {
		// 키를 반응한 상태 Unicode키의 경우 추가이벤트 발생
//		System.out.println("KetTyped : "+e.getKeyChar());
		// getKeyChar는 키가 가진값을 문자형태로 변환
		// getKeyCode는 키가 가진값을 코드형태로 변환
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키를 누르고있는 상태
//		System.out.println("KetPressed : "+e.getKeyChar());
//		System.out.println("KetPressed : "+e.getKeyCode());
		
		if(e.getKeyCode() == 10) {
			
			// 자 Thread 수신기능 추가
			try {
				DataOutputStream send = new DataOutputStream(slient.getOutputStream());
				send.writeUTF(txt1.getText());
				send.flush();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			// 필드를 Area로 이동 
			area.append(" ] Server [ => "+txt1.getText()+"\n");
			// └추가
			
			// 필드 내용은 삭제
			txt1.setText("");
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 키를 땟을 때 상태 UNICODE 미지원
//		System.out.println("KetReleased : "+e.getKeyChar());
	}
	
}

public class C02_1_ServerUI_Body_Input {

	public static void main(String[] args) {
		
		new ServerUI();
		
	}

}

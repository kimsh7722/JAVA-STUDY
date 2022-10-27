package Me27_JAVA_GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
// 이벤트 활성화 함수 
import java.awt.event.ActionListener;
// 키보드 이벤트 활성화
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C06GUI extends JFrame implements ActionListener,KeyListener{
	
	// 전역변수
	JTextArea area; JPanel panel;
	JScrollPane scroll; JTextField txt1;
	JButton btn1; JButton btn2;
	JButton btn3; JButton btn4;
	
	
	C06GUI(){
		super("대화창입니다");
		
		// 필드-패널 생성
		panel = new JPanel(); 
		panel.setLayout(null);
		
		// 택스트 Area 생성
		area = new JTextArea();
		area.setBounds(10,10,150,100);
		
		// 스크롤 추가
		scroll = new JScrollPane(area);
		scroll.setBounds(10,10,200,250);
		
		
		
		// text필드
		txt1 = new JTextField();
		txt1.setBounds(10,270,200,30);
		// key이벤트를 txt로 적용
		txt1.addKeyListener(this);
		
		
		// 버튼 생성
		btn1 = new JButton("입력");
		btn1.setBounds(220,250,120,50);
		// 이벤트 추가
		btn1.addActionListener(this); 
		
		btn2 = new JButton("대화 기록 보기");
		btn2.setBounds(220,130,120,50);
		btn2.addActionListener(this);
		
		btn4 = new JButton("1:1");
		btn4.setBounds(220,70,120,50);
		btn4.addActionListener(this);
		
		btn3 = new JButton("파일 저장");
		btn3.setBounds(220,10,120,50);
		btn3.addActionListener(this);
		
		// 배격색 지정
		Color col = new Color(250,200,180);
		panel.setBackground(col);
		
		// 패널 추가
		add(panel); panel.add(txt1);
		panel.add(btn1); panel.add(btn2); 
		panel.add(btn3); panel.add(btn4);
		panel.add(scroll);
		
		// 프론트 엔트 영역=div
		setBounds(100,100,500,500); // x,y,weight,height
		// 완전끄기 설정안하면 process가 계속 돌아간다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		// visible : 보여라
		setVisible(true);
	}

	// 이벤트 활성화
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트를 발생시킬 component 
		if(e.getSource() == btn1) {
			System.out.println("입력버튼발생!!");
			area.append("Client : "+txt1.getText()+"\n");
			
		}else if(e.getSource() == btn2) {
			System.out.println("대화 기록 보기");
		}else if(e.getSource() == btn4) {
			System.out.println("1:1 대화창!!");
		}else if(e.getSource() == btn3) {
			System.out.println("파일 저장");
		}
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
		System.out.println("KetPressed : "+e.getKeyChar());
		System.out.println("KetPressed : "+e.getKeyCode());
		if(e.getKeyCode() == 10) {
			// 필드를 Area로 이동 
			area.append("Client : "+txt1.getText()+"\n");
				// └추가
			
			// 필드 내용은 삭제
			txt1.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 키를 땟을 때 상태 UNICODE 미지원
		System.out.println("KetReleased : "+e.getKeyChar());
	}
	
}

public class C05_Swing_Event_KeyEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new C06GUI();
	}

}

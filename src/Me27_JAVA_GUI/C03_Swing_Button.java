package Me27_JAVA_GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class C03GUI extends JFrame {
	
	C03GUI(){
		super("네번째 프레임입니다.");
		
		// 패널 생성
		JPanel panel = new JPanel(); 
		// Layout 비활성화
		panel.setLayout(null);
		// 패널 추가
		add(panel);
		
		
		// 버튼 생성
		JButton btn = new JButton("버튼");
		JButton btn1 = new JButton("버튼1");
		// 버튼 크기
		btn.setBounds(10,10,120,60);
		Color color = new Color(225,253,0);
		btn.setBackground(color);
		// 버튼 추가
		
		btn1.setBounds(150,10,120,30);
		
		
		panel.add(btn1);
		panel.add(btn);
		
		// 프론트 엔트 영역=div
		setBounds(100,100,500,500); // x,y,weight,height
		// 완전끄기 설정안하면 process가 계속 돌아간다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		// visible : 보여라
		setVisible(true);
	}
}

public class C03_Swing_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new C03GUI();
	}

}

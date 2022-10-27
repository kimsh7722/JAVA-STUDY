package Me27_JAVA_GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class C0GUI extends JFrame {
	
	C0GUI(){
		super("두번째 프레임입니다.");
		
		// 패널 생성
		JPanel panel = new JPanel(); 
		
		// 배격색 지정
		Color col = new Color(30,30,30);
		panel.setBackground(col);
		// 패널 추가
		add(panel);
		
		
		
		// 프론트 엔트 영역=div
		setBounds(100,100,700,700); // x,y,weight,height
		// 완전끄기 설정안하면 process가 계속 돌아간다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		// visible : 보여라
		setVisible(true);
	}
}
public class C02_Swing_Panel {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("첫번째 프레임입니다");
		new C0GUI();
	}

}

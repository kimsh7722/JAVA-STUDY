
package Me27_JAVA_GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C04GUI extends JFrame {
	
	C04GUI(){
		super("두번째 프레임입니다.");
		
		// 필드-패널 생성
		JPanel panel = new JPanel(); 
		panel.setLayout(null);
		
		// 택스트 필드 생성
		JTextArea area = new JTextArea();
		area.setBounds(10,10,150,100);
		
		// 스크롤 추가
		JScrollPane scroll = new JScrollPane(area);
		scroll.setBounds(10,10,200,250);
		
		
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,270,200,30);
		
		// 버튼 생성
		JButton btn1 = new JButton("버튼1");
		btn1.setBounds(220,250,120,50);
		JButton btn2 = new JButton("버튼2");
		btn2.setBounds(220,130,120,50);
		JButton btn3 = new JButton("버튼3");
		btn3.setBounds(220,10,120,50);
		JButton btn4 = new JButton("버튼4");
		btn4.setBounds(220,70,120,50);

		
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
}

public class C04_Swing_Area_Scroll_Field {

	public static void main(String[] args) {

			new C04GUI();
	}

}

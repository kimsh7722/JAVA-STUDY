package Me27_JAVA_GUI;

import javax.swing.JFrame;

class C01GUI extends JFrame {
	
	C01GUI(){
		super("두번째 프레임입니다.");
		// 프론트 엔트 영역=div
		setBounds(100,100,700,700); // x,y,weight,height
		
		// 완전끄기 설정안하면 process가 계속 돌아간다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// visible : 보여라
		setVisible(true);
	}
}

public class C01_Swing {

	public static void main(String[] args) {
		JFrame frame = new JFrame("첫번째 프레임창입니다.");
		System.out.println(frame);
	}

}

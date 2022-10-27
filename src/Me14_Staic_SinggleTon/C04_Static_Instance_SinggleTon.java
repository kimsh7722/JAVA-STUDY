package Me14_Staic_SinggleTon;

class C04simple {
//	멤버 변수
	private static C04simple instance;
	int x,y;
//	생성자	
	private C04simple() {
		x=10;
		y=20;
	};
	
//	멤버 함수
	public static C04simple getInstance() {
		if(instance == null) {
			instance = new C04simple();
		}
		return instance;
	}
}

public class C04_Static_Instance_SinggleTon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C04simple sim = C04simple.getInstance();
		C04simple simp = C04simple.getInstance();
		System.out.println(sim == simp);
		System.out.println("mySim : "+sim.x);
		System.out.println("mySimP : "+simp.y);
		
	}
}

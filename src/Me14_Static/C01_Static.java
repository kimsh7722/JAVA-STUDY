package Me14_Static;

/*
 * 
 */

class Simple {
//	멤버 변수
	static int Num1=0; // 공유변수
	int Num2;
	
//	멤버 변수
	void ShowNum() {
		System.out.println("Num1 : "+Num1+"\n"+"Num2 : "+Num2);
	}
}

public class C01_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple sim = new Simple();
		Simple simp = new Simple();
		sim.Num1=10;
		sim.Num2=20;
		sim.ShowNum();
		System.out.println();
		simp.ShowNum();
		System.out.println();
		simp.Num1=100;
		simp.Num2=200;
		sim.ShowNum();
		System.out.println();
		simp.ShowNum();
		
	}

}

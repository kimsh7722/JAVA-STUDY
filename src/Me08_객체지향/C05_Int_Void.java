package Me08_객체지향;

import java.util.Scanner;

class Sum {
	Scanner sc = new Scanner(System.in);
	int sum1(int x, int y) {
		return x+y;
	}
	int sum2() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
	}
	
	void sum3(int x, int y) {
		System.out.println("SUM3 : "+(x+y));
	}
	
	void sum4() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("SUM4 : "+(x+y));
	}
}

public class C05_Int_Void {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum calc = new Sum(); // calc 참조 변수
		int r1 = calc.sum1(10,20);
		System.out.println("SUM1 : "+r1);
		
		int r2 = calc.sum2();
		System.out.println("SUM2 : "+r2);
		
		calc.sum3(20,30);
		
		calc.sum4();
	}

}

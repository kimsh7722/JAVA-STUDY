package Me8_객체지향;

import java.util.Scanner;

class Sub {
	Scanner sc=new Scanner(System.in);
	void sum1() {
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println((n1+n2));
	}
}


public class C06_int_활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub calc=new Sub();
		calc.sum1();
	}

}

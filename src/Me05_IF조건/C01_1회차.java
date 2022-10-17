package Me05_IF조건;

import java.util.Scanner;

public class C01_1회차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		if(n1>n2) {
//			System.out.println("큰수 : "+n1);
//		}else {
//			System.out.println("큰수 : "+n2);
//		}
		
//		int n1 = sc.nextInt(); int n2=sc.nextInt(); int n3=sc.nextInt();
//		int sum = n1+n2+n3;
//		double avg = sum/3;
//		System.out.println("해당 평균값은 "+avg+"%");
		
		int n1 = sc.nextInt(); int n2=sc.nextInt(); int n3=sc.nextInt();
		if( n1 > n2 && n1 > n3) {
			System.out.println("n1 : "+n1);
		}
		if( n2 > n1 && n2 > n3 &&((n2!=n1) && (n2!=n3))) {
			System.out.println("n2 : "+n2);
		}
		if( n3 > n1 && n1 > n2 &&((n3!=n1))) {
			System.out.println("n3 : "+n3);
		}
	}

}

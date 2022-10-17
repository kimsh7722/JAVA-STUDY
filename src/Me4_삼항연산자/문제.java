package Me4_삼항연산자;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//문제
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
//		int num2= 12;
//		System.out.print("배수 입력 : "); int num1 = sc.nextInt();
//		String result = (num2%num1 == 0) ? num1+"의 배수입니다" : "배수가 아닙니다";
//		System.out.println(result);
		
		//문제
		// 두수를 입력받아 두수 중에 큰수를 출력
//		System.out.print("수 입력 : "); int num1 = sc.nextInt();
//		System.out.print("수 입력 : "); int num2 = sc.nextInt();
//		String result = (num1 >= num2) ? num1+"이 큽니다" : num2+"이 큽니다";
//		System.out.println(result);
		
		//문제
		// 세 정수를 입력받아 세 정수 중에 가장 큰수와 가장 작은수를 출력
		System.out.print("수 입력 : "); int num1 = sc.nextInt();
		System.out.print("수 입력 : "); int num2 = sc.nextInt();
		System.out.print("수 입력 : "); int num3 = sc.nextInt();
		
		
					
//			System.out.println(result);
		
		
		
		
		//문제
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		int sum = num1+num2+num3;
		int avg =(num1+num2+num3)/3;
		System.out.println("합계 : "+sum+" / "+"평균 : "+avg+"%");
	}

}

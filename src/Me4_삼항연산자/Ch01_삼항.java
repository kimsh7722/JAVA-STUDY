package Me4_삼항연산자;

import java.util.Scanner;

public class Ch01_삼항 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 삼항 연산자
		 * 조건식 ? 참  : 거짓
		 * 예)(num>0)  ? A : B
		 * */
		
//		int num1 = 11;
//		String result = (num1%2==0) ? "짝수입니다" : "홀수입니다";
//		System.out.println("결과 : "+result);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배수 입력 "); int num1=sc.nextInt();
		System.out.print("넣고자하는 총수를 입력 : "); int num2=sc.nextInt();
		String reuslt = (num2%num1 == 0) ? num1+"의 배수입니다" : "나누어 떨어지지 않습니다";
		System.out.println("결과 : "+reuslt);
		
		sc.close();
		
		
		
		
	}

}

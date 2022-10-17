package Me3_Scanner;

import java.util.Scanner;
// ctrl + shift + o : 자동 Import 생성
// control + shift + f : 자동정렬

public class C01_Scanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//					System.in : 표준 입력 스트림 : 데이터 통로
//					System.out : 표준 출력 스트림

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int sum = num1 + num2 + num3 + num4;
		System.out.printf("%d+%d+%d+%d=%d\n", num1, num2, num3, num4, sum);

		sc.close();
	}
}

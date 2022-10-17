package Me7_반복문;

import java.util.Scanner;

public class C01_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		선진입 후 탈출
//		int i = 1; // [초기값]
//		while(i <= 10) // 조건값
//		{
//			System.out.println(i);
//			i++; // [증가값]
//		}
		
//		int i=1;
//		int sum=0;
//		while(i<10) {
//			System.out.println(i);
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
		
//		1부터 입력한 정수(N)까지 합 구하기
//		int N=sc.nextInt();
//		int i=1, sum=0;
//		while(i<N) {
//			System.out.println(i);
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
		
//		N,M을 입력받아서 N부터 M까지의 합 구하기(N<M)
//		int N=sc.nextInt(), M=sc.nextInt();
//		int sum=0;
//		while(N < M) {
//			System.out.println(N);
//			sum+=N;
//			N++;
//		}
//		System.out.println(sum);
		
//		구구단 2단
//		int i=1;
//		while(i < 10) {
//			int j=2, k=j*i;
//			System.out.println(j+" X "+i+" = "+k);
//			i++;
//		}
		
//		구구단 N단
//		int N=sc.nextInt();
//		int i=1;
//		while(i < 10) {
//			int k=N*i;
//			System.out.println(N+" X "+i+" = "+k);
//			i++;
//		}
		
//		역순 출력
//		int N=sc.nextInt();
//		int i=9;
//		while(i >= 1) {
//			int k=N*i;
//			System.out.println(N+" X "+i+" = "+k);
//			i--;
//		}
		
//		int n=sc.nextInt();
//		int i=1; int j=0;
//		while( i <= n) {
//			if(n%3 == 0) {
//				j=n*i;
//				System.out.println("3의 배수 : "+j);
//				i++;
//			}
//		}
		
//		거꾸로 출력-이론 쓰발 나만의식 됫다
		String sd =sc.nextLine();
		
		int i = sd.length();
		while(i > 0) {
			
			System.out.println(sd.charAt(i-1));
			i--;
		}
	}
}

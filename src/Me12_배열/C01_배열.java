package Me12_배열;

import java.util.*;

public class C01_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 다양한 쓰이기
		 * int arr[] = new int[]
		 * 					배열갯수
		 * int[] arr = new int[]
		 * int arr[] = {{1},{2},{3}}
		 * 				배열갯수의 요소
		 * 2차원 배열
		 * arr[][]={{{1,2}},{3,4}..}
		 * 			2차원 배열 요소
		 */
		Scanner sc = new Scanner(System.in);
//		길이가 5인 int형 1차원 배월의 생성
		int[] ar1 = new int[5];	
		
		ar1[0]=sc.nextInt();
		ar1[1]=sc.nextInt();
		ar1[2]=sc.nextInt();
		ar1[3]=sc.nextInt();
		ar1[4]=sc.nextInt();
		
		for(int i=0; i<ar1.length; i++) {
			System.out.println("일반적인 방식으로 배열값 호출");
			System.out.println("배열 호출:"+ar1[i]);
		}
		System.out.println();
		// 배열[ar1]안의 요소를 int val로 접근
		for(int val : ar1) {
			System.out.println("간단하게 배열안의 값 호출");
			System.out.println("Val : "+val);
		}
		
//		길이가 7인 double형 1차원 배월의 생성
		double[] ar2 = new double[7];
		
//		배열의 참조변수와 인스턴스 생성분리
		float[] ar3;
		ar3=new float[9];
		
//		배열의 인스턴스변수 접근
		System.out.println("배열의 ar1길이: "+ar1.length);
		System.out.println("배열의 ar2길이: "+ar2.length);
		System.out.println("배열의 ar3길이: "+ar3.length);
	}

}

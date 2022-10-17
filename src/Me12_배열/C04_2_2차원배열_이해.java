package Me12_배열;

import java.util.Scanner;

public class C04_2_2차원배열_이해 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 개념
		 * 1차원 배열 : arr.length = 배열의 길이
		 * 2차원 배열 : arr.length = 행의 길이
		 * 2차원 배열 : arr[?].length = 열의 길이
		 * 
		 * arr[행][열]
		 */
		
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[5][3];
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
//		각행의 합
		int std[]=new int[5];
		int cnt=0;
		for(int tmp[] : arr) {
			
			for(int n : tmp) {
				std[cnt]+=n;
			}
			cnt++;
		}		
		for(int i=0; i<std.length; i++) {
			System.out.println(i+"번째 학생 총점 : "+std[i]);
		}
		System.out.println("---------------------------------");
		
//		각열의 총점
		int subject[]=new int[3];
		for(int i=0; i< 3; i++) {
			for(int j=0; j < std.length; j++) {
				subject[i]+=arr[j][i];
			}
			System.out.println("각열의 합 : "+subject[i]);
		}
//		각열의 평가
				
	}

}

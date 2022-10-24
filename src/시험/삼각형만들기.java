package 시험;

import java.util.Scanner;

public class 삼각형만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("높이 입력 : ");
		int height = sc.nextInt();
		
		for(int i=0; i < height; i++) {
			for(int j=i; j < height-1; j++) {
				System.out.print(" ");				
			}
			for(int k=0; k <= i; k++) {
				System.out.print("*");
			}
			for(int y=0; y < i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=1; i < 7; i++) {
//			for(int j=7; j > i; j--) {
//			System.out.print("*");
//			}
//			System.out.println("");
//		}
	
		}

}

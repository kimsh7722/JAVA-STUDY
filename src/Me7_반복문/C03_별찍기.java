package Me7_반복문;

import java.util.Scanner;

public class C03_별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(i=1; i < 7; i++) {
//			System.out.println("");
//			for(j=7; j > i; j--) {
//				System.out.print("*");
//			}
//		}
//		
//		for(int k=1; k <= 7; k++) {
//			for(int n=1; n < k; n++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		Scanner sc= new Scanner(System.in);
		int i=0; // 행
		int	j=0; // 열
		int k=0;
		int n=sc.nextInt();
		
			while(i < n) {
				
				if(i < (n/2)+1) {
					j=0;
					while(j < (n/2-1)-i) {
						System.out.print(" ");
						j++;	
					}
					k=0;
					while(k <= i*2) {
						System.out.print("*");
						k++;
					}
					System.out.println();
					i++;				
				}else{
					j=0;
					while(j < i-(n/2)) {
						System.out.print(" ");
						j++;	
					}
					k=0;
					while(k < (n*2)-(i*2-1)) {
						System.out.print("*");
						k++;
					}
					System.out.println();
					i++;
													
				}
			}
//			while(i < 4) {}
			
		
	}

}

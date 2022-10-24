package Me07_반복문;

import java.util.Scanner;

public class C04_다이아몬드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int input = sc.nextInt();
		int i,j,k;
		i=0;
		while(i < input) {
			if(i < input-2) {
				j=0;
				while(j<=2-i) {
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=2*i) {
					System.out.print("*");
					k++;
				}
				System.out.println();
				i++;
			}else {
				j=0;
				while(j<=i-4) {
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k <= (6*2)-(2*i)) {
					System.out.print("*");
					k++;
				}
				System.out.println();
				i++;
			}
		}
	}

}

package Me7_반복문;

public class C04_다이아몬드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i,j,k;
		i=0;
		while(i < 7) {
			if(i < 4) {
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

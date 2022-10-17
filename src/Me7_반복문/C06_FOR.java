package Me7_반복문;

public class C06_FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1부터 10까지의 합
		int sum=0; int n;
//		for(int i=0; i<10; i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
//		1부터 N까지의 합
//		for(int i=0; i<n; i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
//		int j=2;
//		for(int i=1; i < 10orN; i++) {
//			System.out.println(j+"X"+i+"="+(i*j));
//		}
		
//		int product;
//		for(int i=1; i < 10; i++) {
//			for(int j=1; j < 10; j++) {
//				product=i*j;
//				System.out.println(i+"X"+j+"="+product);				
//			}
//			System.out.println();
//		}
		
//		별찍기
		for(int i=0; i < 7; i++) {
			if(i < 4) {
				for(int j=0; j <= 2-i; j++) {
					System.out.print(" ");
				}
				for(int k=0; k <= 2*i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j=0; j <= i-4; j++) {
					System.out.print(" ");
				}
				for(int k=0; k <= (6*2)-(2*i); k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
	}

}

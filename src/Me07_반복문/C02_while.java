package Me07_반복문;

public class C02_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		구구단
		
//		int dan=2;
//		역순
		int dan =9;
		int i;
		while(dan >= 2) {
			
			i=9;
			while(i >= 1) {
				System.out.println(dan+"X"+i+"="+(i*dan));
				i--;
			}
			System.out.println();
			dan--;
		}
	}

}

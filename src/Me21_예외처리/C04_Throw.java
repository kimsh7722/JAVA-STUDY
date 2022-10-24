package Me21_예외처리;

public class C04_Throw {

	public static void Ex1() {
		try {
//		 	 ┌3인칭
			throw new ArithmeticException();
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
//		System.out.println("Ex1에서의 코드");
	}		
								//		┌2인칭
	public static void Ex2() throws ArithmeticException 
	{
		throw new ArithmeticException();
	}
	
	public static void Ex3() {
		
	}
	
	public static void main(String[] args) {

			System.out.println("EX1 코드입니다 ");
			Ex1();
			System.out.println("------------------------------------------");
			
			try {
				Ex2();
			}catch(Exception e) {
				System.out.println("Main에서 처리");
			}
	}

}

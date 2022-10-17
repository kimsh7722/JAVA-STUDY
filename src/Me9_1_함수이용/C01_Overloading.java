package Me9_1_함수이용;

class mohod {
	String name;
	
//	함수는 반드시 같아야하며 메개변수는 다르게쓸수있다
//	sum의 함수를 여러개 쓴다
	int sum(int x, int y) {
		System.out.println("X+Y");
		return x+y;
	}
	
	int sum(double x, double y) {
		System.out.println("Double");
		return (int)(x+y);
	}
	
	int sum(String str1, int x, int y) {
		System.out.println("String,int,int");
		name=str1;
		return x+y;
	}
}

public class C01_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mohod mo = new mohod();
		mo.sum("홍",15, 15);
		
		
	}

}

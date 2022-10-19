package Me14_Static;

class C03Simple {
	int n1;
	static int n2 ;
	void func1() {
		n1=10;
		n2=20;
	}
	static void func2() {
//		n1=10; // static지정한곳에선 전역변수 쓸수없다
		n2=20;
	}
}

public class C03_Static_지역_전역차이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

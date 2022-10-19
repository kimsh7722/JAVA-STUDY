package Me16_상속2_Overriding;

class A {
	int n1=10;
	
}
class B extends A{
	int n2=20;
}
class C extends A{
	int n3=30;
}
class D extends B{
	int n4=40;
}

public class C04_UpCasting_DownCasting_Instanceof {
			/*
			 * 상위클래스 참조변수 = 하위객체 연결, 자동형변환,
			 *						하위클래스의 확장된 멤버 접근 불가능 
			 */			
	public static void UpcastingTest(A tmp) {
//		System.out.println(tmp.n1);
		
		/*
		 * DownCasting 하위클래스 참조변수 = 상위객체, 강제형변환
		 * instanceof 
		 * - 객체 타입을 확인하는 연산자, 형벼환 가능 여부를 확인
		 * - true/false 리턴
		 * - 객체 instanceof 클래스
		 */
		if(tmp  instanceof B) {
			B down = (B)tmp;
			System.out.println(down.n2);
		}
		if(tmp  instanceof C) {
			C down = (C)tmp;
			System.out.println(down.n3);
		}
		if(tmp  instanceof D) {
			D down = (D)tmp;
			System.out.println(down.n4);
		}
	}
	
	public static void main(String[] args) {
		B ob1 = new B();
		C ob2 = new C();
		D ob3 = new D();
		
		UpcastingTest(ob1);
		UpcastingTest(ob2);
		UpcastingTest(ob3);
		
	}

}

package Me18_InterFace;

// 일반클래스간의 다중상속X
//interface A{}
//interface B{}
//class C implements A,B {
//	
//}

// 일반클래스가 인터페이스 다중상속 0
//interface A {}
//interface B {}
//class C implements A,B {}

// 인터페이스간 다중상속 O
interface A {}
interface B {}
interface C extends A,B {}


public class C02_다중상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

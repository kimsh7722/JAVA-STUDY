package Me17_추상화;

class par1 {
	
//	일반 메서드
	void method() {}
}

class son1 extends par1 {
	void method() {
		System.out.println("Son1의 자율적 재정의된 메서드");
	}
}

// --------------------------------------------------------------------
// 추상화	
abstract class par2 {
//	추상메서드
	abstract void method2();
}

class son2 extends par2 {

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("Son2의 강제 재정의된 메서드");
		
	}	
}

public class C01_추상화 {
	
	public static void main(String[] args) {
//		일반 클래스
		par1 ob1 = new par1();
		son1 ob2 = new son1();
		ob1=ob2;
		ob1.method();
		
//		추상화 클래스
//		par2 ob3 = new par2(); 	// 추상객체 생성불가
		par2 ob3=null;			// 참조변수 생성가능
		son2 ob4=new son2();	// 하위클래스에 추상메서드가 재정의 대었다면 객체 생성
		ob4.method2();
	}
}

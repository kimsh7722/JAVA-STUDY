package Me19_Object_HashCode;

import javax.sound.midi.SysexMessage;

class Simple {
	int n;
	Simple(int n) {
		this.n=n;
	}
//	@Override
//	public boolean equals(Object obj) {
//		
//		return super.equals(obj);
//	}

	@Override
	public boolean equals(Object obj) { // obj = ob2 업캐스팅
		// TODO Auto-generated method stub
		if(obj instanceof Simple) { // 받은객체 맞는지 확인 down캐스팅
			Simple down= (Simple)obj; // 변수 접근
			return this.n == down.n;
		}
		return false;
	}
	
}

public class C02_Object_Up_Down {
	
	public static void main(String[]args) {
		Simple ob1 = new Simple(10);
		Simple ob2 = new Simple(10);
		Simple ob3 = new Simple(14);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		System.out.println("--------------------------------------------------------");
//		String 클래스
		String str1 = new String("HELLOW World");
		String str2 = new String("HELLOW World");
		System.out.println(str1.toString()); // String Class는 toString() 재정의 됨
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1.equals(str2));
	}
}

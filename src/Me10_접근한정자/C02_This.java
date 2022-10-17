package Me10_접근한정자;

/*
 * this 란
 * 클래스 내에서 사용되는 예약어
 * 생성되는 객체의 위치정보를 가져오는 데 사용
 * 
 * 멤버변수 vs 매개변수 구별
 * this.x   =    y
 * Ovrloading된 다른생성자 호출 가능
 */

class C02Simple {
	int x; int y;

	C02Simple() {
//		x, y 호출
		this(10,20);
		System.out.println("제1 생서자 호출");
	}
	C02Simple(int m) {
//		this.x=m;
//		(매게변수 m), y호출
		this(m,10);
		System.out.println("제2 생성자 호출");
		System.out.println("X : "+x);
	}
	C02Simple(int m, int g) {
		this.x=m;
		this.y=g;
		System.out.println("제3 생성자 호출");
		System.out.println("X : "+x);
		System.out.println("X : "+y);
	}
	
	C02Simple getThis() {
		return this;
	}
	
}

public class C02_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C02Simple sim1 = new C02Simple();
		System.out.println(sim1);
		System.out.println(sim1.getThis());
		System.out.println();
		
		C02Simple sim2 = new C02Simple(30);
		System.out.println();
		C02Simple sim3 = new C02Simple(50,60);
		System.out.println();
	}

}

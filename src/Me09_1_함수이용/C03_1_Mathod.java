package Me09_1_함수이용;

/*
 *	생성자 Mathod 
 *	객체 생성시에 호출되는 특수한 메서드
 *	객체 생성시에 1회 호출
 *	객체 생성시 필요한 초기값을 부여
 *	클래스 내에 생성자 함수가 명시되지(코드삽입X) 않을 경우
 *	디폴트 생성자가 자동으로 주입되어서 사용 
 */

class Simple {
//	속성
	int x;
	int y;
	Simple() {
		System.out.println("디폴트 생성자 호출");
		this.x=100;
		this.y=100;
	}
}


public class C03_1_Mathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple obj = new Simple();
		System.out.println(obj.x+" "+obj.y);
	}

}

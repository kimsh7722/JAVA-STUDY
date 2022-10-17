package Me9_2_정리;

class C01Car {
	String owner;
	int speed;
	int fuel;
	String model;
	C01Car() {}
	
//	기능적인 요소
	void Accel(){
		if(fuel-5<=0) {
			fuel=0;
			System.out.println("[ERR]가속불가 - 연료가 부족합니다.");
		}else {
			fuel-=5;
			if(speed+10>=200) {
				speed=200;
				System.out.println("[WARN]최대속도입니다. 200km/h");
			}else {
				speed+=10;
				System.out.println("[INFO]가속합니다. 현재속도 : "+speed+"km/h");
			}
		}
	}
	void Break(){
		
		if(speed-5<=0) {
			speed=0;
			System.out.println("[INFO]감속불가 합니다. 현재속도 : 0km/h");
		}else {
			speed-=5;
			System.out.println("[INFO]감속합니다. 현재속도 : "+speed+"km/h");
		}		
	}
	
//	Overriding하여 하나의 생성자로부터 여러개의 파라미터값
	C01Car(String owner, int x, int y, String model) {
		this.owner=owner;
		this.speed=x;
		this.fuel=y;
		this.model=model;
	}

	C01Car(String owner, int x, String model, int y) {
		this.owner=owner;
		this.speed=x;
		this.model=model;
		this.fuel=y;
	}
	
	C01Car(String owner, String model, int x, int y) {
		this.owner=owner;
		this.model=model;
		this.speed=x;
		this.fuel=y;
	}

//	Override는 항상 위생성자(C01Car)인자로부터 메게변수를 받아 보내는 것을 잊지말라 
	@Override
	public String toString() {

		return "C05Car ["
		+ "owner="+ owner + ","
		+ " speed="+ speed + ","
		+ " fuel="+ fuel + ","
		+ " model="+ model + "]";
	}
}


public class C01_CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C01Car car01 = new C01Car("홍길동",0,100,"코나");
		System.out.println(car01.toString());
		
		C01Car car02 = new C01Car("서길동",50,"아반떼",0);
		System.out.println(car02.toString());
		
		C01Car car03 = new C01Car("김철수","그렌저",100,200);
		System.out.println(car03.toString());
		
	}

}

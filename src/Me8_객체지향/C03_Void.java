package Me8_객체지향;

class Car {
	String name;
	int speed;
	int fuel;
	String model;
	
//	가속 기능
	void Accel() {	
		
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
	
//	감속 기능
	void Break() {
		if(speed-5<=0) {
			speed=0;
			System.out.println("[INFO]감속불가 합니다. 현재속도 : 0km/h");
		}else {
			speed-=5;
			System.out.println("[INFO]감속합니다. 현재속도 : "+speed+"km/h");
		}
	}
}


public class C03_Void {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.name = "김씨";
		c.speed = 200;
		c.fuel = 100;
		c.model = "카니발";
		while(true) {
//			c.Accel();
			c.Break();
			Thread.sleep(500);
		}
	}

}

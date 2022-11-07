package Me34_기획자;

public class Car {
	String carNumber;
	String model;
	
	Car(String carNum, String model,Engine engine, Radio radio) {
		this.carNumber=carNum;
		this.model=model;
		engine=new Engine();
		radio=new Radio();
	}
	
	void move() {
		System.out.println("자동차 움직입니다");
	}
}


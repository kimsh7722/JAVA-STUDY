package Me22_제네릭_중요;

abstract class 재료 {}

class 팥1 extends 재료{
	String meterial;

	팥1(String meterial) {
		this.meterial = meterial;
	}

	@Override
	public String toString() {
		return "팥 [meterial=" + meterial + "]";
	}
	
}

class 야채1 extends 재료{
	String  meterial;
	야채1(String meterial) {
		this.meterial=meterial;
	}
	@Override
	public String toString() {
		return "야채 [meterial=" + meterial + "]";
	}
}

class 피자 extends 재료{
	String met;
	피자(String mater) {
		this.met=mater;
	}
	@Override
	public String toString() {
		return "슈크림 [met=" + met + "]";
	}
}

class 민초 extends 재료{
	String met;
	민초(String mater) {
		this.met=mater;
	}
	@Override
	public String toString() {
		return "슈크림 [met=" + met + "]";
	}
}


class 호빵1<T extends 재료> {
	private T meterial;

	호빵1(T meterial) {
		this.meterial = meterial;
	}

	void ShowInfo() {
		System.out.println(meterial.toString() + "으로 만든 호빵!");
	}
}

public class C05_Generic_실습 {

	public static void main(String[] args) {


		호빵1<팥1> ob1 = new 호빵1<팥1>(new 팥1("단팥"));
		ob1.ShowInfo();

		호빵1<야채1> ob2 = new 호빵1(new 야채1("야채"));
		ob2.ShowInfo();

		호빵1<피자> ob3 = new 호빵1(new 피자("불고기맛"));
		ob3.ShowInfo();
		
		호빵1<민초> ob4 = new 호빵1(new 민초("홀리쉿"));
		ob4.ShowInfo();
	}

}

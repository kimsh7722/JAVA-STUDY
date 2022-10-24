package Me22_제네릭_중요;

class 팥 {
	String meterial;

	팥(String meterial) {
		this.meterial = meterial;
	}

	@Override
	public String toString() {
		return "팥 [meterial=" + meterial + "]";
	}
	
}

class 야채 {
	String  meterial;
	야채(String meterial) {
		this.meterial=meterial;
	}
	@Override
	public String toString() {
		return "야채 [meterial=" + meterial + "]";
	}
}

// 1. 제네릭 변수 지정할 것
class 슈크림 {
	String met;
	슈크림(String mater) {
		this.met=mater;
	}
	@Override
	public String toString() {
		return "슈크림 [met=" + met + "]";
	}
	
}

//	어떠한 클래스,메소드를 담을 수있는 연산자 그것이 제네릭
//		  ┌제네릭 타입
class 호빵<T> {
	private T meterial;

//	제네릭정보가 호빵생성자에 담다
//	밑에서 담은 클래스안의 값이 매개변수로 다시담는다
	호빵(T meterial) {
		this.meterial = meterial;
	}

	void ShowInfo() {
		System.out.println(meterial.toString() + "으로 만든 호빵!");
	}
}

public class C01_Generic {

	public static void main(String[] args) {

//			 제네릭타입을 팥이란 클래스에 넣겟다
		호빵<팥> ob1 = new 호빵<팥>(new 팥("단팥"));
		ob1.ShowInfo();

		호빵<야채> ob2 = new 호빵(new 야채("야채"));
		ob2.ShowInfo();

//		2.호빵에 제네릭class를 슈크림에 담아서
//		3.호빵안에 (new 슈크림(""))정보를 담다
		호빵<슈크림> ob3 = new 호빵(new 슈크림("슈크림넣엇나?"));
		ob3.ShowInfo();
	}

}

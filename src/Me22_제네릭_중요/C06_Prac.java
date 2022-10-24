package Me22_제네릭_중요;

class C06Water{
	public void doC06Printing() {
		System.out.println("Water 재료로 출력");
	}
}

class C06Plastic{
	public void doC06Printing() {
		System.out.println("Powder 재료로 출력");
	}
}
class C06Powder{
	public void doC06Printing() {
		System.out.println("Plastic 재료로 출력");
	}
}

class C06ThreeDPrinter<T>{
	//- meterial : Generic <T> //제너릭 설정할것, Getter and Setter 함수도 같이 만들어보세요 ~
	private T meterial;

	public T getMeterial() {
		return meterial;
	}
	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
}
public class C06_Prac {
	public static void main(String[] args) {
		
		try {
		C06ThreeDPrinter<C06Powder> print1 = new C06ThreeDPrinter<C06Powder>(); //3d프린트의 제너릭 타입을 Powder로 지정
																	//3d프린트<Powder> 객체 생성
		print1.setMeterial(new C06Powder());							//Powder객체 생성 후 주소를 3d프린트객체로 전달
		print1.getMeterial().doC06Printing();		//3d프린트의 get함수로 meterial을 꺼내 doPrinting()
		
		
		C06ThreeDPrinter<C06Plastic> print2 = new C06ThreeDPrinter<C06Plastic>();
		print2.setMeterial(new C06Plastic());
		print2.getMeterial().doC06Printing();
		
		
		//문제 재료는 Plastic과 Powder만 가능하게 extends 합니다!
		C06ThreeDPrinter<C06Water> print3 = new C06ThreeDPrinter();
		print3.setMeterial(new C06Water());
		print3.getMeterial().doC06Printing();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

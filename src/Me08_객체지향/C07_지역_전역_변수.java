package Me08_객체지향;

class LocalVar {
	int num=10; // 전역변수
	
	void Func1() {
		if(true) {
			int num=100; // 지역변수
			System.out.println("if문 안의 변수 : "+num);
		}
		System.out.println("멤버변수 num = "+num);
	}
	void Func2() {
		int i = 1;
		int num = 0;
		while(i <= 5) {
			System.out.println("변수 값 : "+(num++));
			i++;
		}
		System.out.println("While 벗어남 num = "+num);
//		외부에 사용하는 변수
		System.out.println("멤버 변수 : "+(this.num));
		
	}
	
}

public class C07_지역_전역_변수 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocalVar lo = new LocalVar();
		lo.Func1();
		
		lo.Func2();
		Thread.sleep(1000);
	}

}
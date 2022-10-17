package Me09_1_함수이용;

class Person {

//	Overloading 방식 함수 하나로 여려개 매개변수출력이 가능하다
	void setPerson(String name) {
		System.out.println(name);
	}
	void setPerson(String name, int num1) {
		System.out.println(name+" "+num1);
	}
	void setPerson(String name, int num1, String addr) {
		System.out.println(name+" "+num1+" "+addr);
	}
	
	void ShowInfo() {
		System.out.println("///////////");
	}
}


public class C02_OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Person();
		per.setPerson("홍길동");
		per.ShowInfo();
		per.setPerson("서길동",10);
		per.ShowInfo();
		per.setPerson("강호동",55,"서울");
		per.ShowInfo();
		
				
	}

}

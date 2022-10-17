package Me08_객체지향;

class PersonMain{
//	속성
	String name;
	int age;
	
//	기능
	void talk() {
		System.out.println(name+"이 예기하십니다");
	}
	void walk() {
		System.out.println(name+"는 이동합니다");
	}
	void ShowInfo() {
		System.out.println(name+"/"+age);
	}
}

public class C02_4_객채기능부여 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonMain object= new PersonMain();
		object.name="홍길동";
		object.age=25;
		
		object.talk();
		object.walk();
		object.ShowInfo();
		
	}

}

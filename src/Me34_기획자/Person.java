package Me34_기획자;

public class Person implements ToDo{

	String name;
	int age;
	String address;
	
	protected Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name+"이 음식을 먹습니다");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(name+"이 잠을 잡니다");
	}

	void drive(Car car) {
		car.move();
	}
	
}

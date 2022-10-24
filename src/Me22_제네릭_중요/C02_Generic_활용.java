package Me22_제네릭_중요;

class Simple<T> {
	T x;
	T y;
	
	Simple(T x, T y) {
		this.x=x; this.y=y;
	}
	
	void ShowMember() {
		System.out.println("X : "+x+"\n"+"Y : "+y);
	}
}

class Person {
	String name;
	String addr;
	Person(String name, String addr) {
		this.name=name; this.addr=addr;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + "]";
	}
}


public class C02_Generic_활용 {

	public static void main(String[] args) {

		Simple<Integer> ob1 = new Simple<Integer>(10,20);
		ob1.ShowMember();
		System.out.println();
		
//												┌T X 쪽						┌T Y 쪽
		Simple<Person> ob2 = new Simple(new Person("이상민","서울"), new Person("서길동","서대구"));
		ob2.ShowMember();
	}

}

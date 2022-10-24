package Me19_Object_HashCode;

import java.util.Objects;

class Person {
	String name;
	int age;
	
	public Person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.name, this.age);
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person) {
			Person down = (Person)obj;
			return this.name == down.name && this.age == down.age;
		}
		return false;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class C06_실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1 = new Person("이승철",35);
		Person obj2 = new Person("조용필",50);
		Person obj3 = new Person("이승철",35);	
		//toString() 재정의 확인
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println("================================");
		//hashcode()확인
		System.out.println(obj1.hashCode()==obj2.hashCode());
		System.out.println(obj2.hashCode()==obj3.hashCode());
		System.out.println(obj3.hashCode()==obj1.hashCode());
		System.out.println("================================");
		//equals()확인
		System.out.println(obj1.equals(obj2));
		System.out.println(obj2.equals(obj3));
		System.out.println(obj1.equals(obj3));	
	}

}

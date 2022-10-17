package Me08_객체지향;

class person {
	String name;
	int age;
	String addr;
}


public class C02_3_클래스_객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person per = new person();
		per.name="홍길동";
		per.age=25;
		per.addr="활빈당";
		System.out.println(per.name+"/"+per.age+"/"+per.addr);
				
	}

}

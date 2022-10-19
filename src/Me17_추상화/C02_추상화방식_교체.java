package Me17_추상화;

// 추상화 - 외부로부터 하위객체로 반환
abstract class Employee2	//직원
{
	String name;
	String age;
	String addr;
	Employee2(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	abstract void show();
}
class Parttimer2 extends Employee2	//시간제
{
	int hourpay;
	Parttimer2(String name,String age,String addr, int hourpay){
		super(name,age,addr);
		this.hourpay = hourpay;
	}
	@Override
	void show() { // 추상메서드 출력을 같게
		// TODO Auto-generated method stub
		System.out.printf("시간제 글로자 : %s %s %s %d\n",name,age,addr,hourpay);
	}
	
	
}
class Regular2 extends Employee2	//정규직
{
	int salary;
	Regular2(String name,String age,String addr,int salary){
		super(name,age,addr);
		this.salary=salary;
	}
	
	@Override
	void show() {
		System.out.printf("시간제 글로자 : %s %s %s %d\n",name,age,addr,salary);
	}
	
}
public class C02_추상화방식_교체 {

	public static  void ShowInfo(Employee2 emp1) {
		emp1.show();
	}
	
	public static void main(String[] args) {
		Parttimer2 emp1 = new Parttimer2("홍길동","25","대구",20000);
		Regular2 emp2 = new Regular2("서길동","45","울산",50000000);
		ShowInfo(emp1);
		System.out.println("------------------------");
		ShowInfo(emp2);

	}

	
	
	
	
	
	
	
	

}

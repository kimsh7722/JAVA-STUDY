package Me16_상속2_Overriding;

class Employee2	//직원
{
	String name;
	String age;
	String addr;
	public Employee2(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	void show() {}
	
}
class Parttimer2 extends Employee2	//시간제
{
	int hourpay;
	Parttimer2(String name,String age,String addr, int hourpay){
		super(name,age,addr);
		this.hourpay = hourpay;
	}
	@Override
	void show() {
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
public class C05_ToString방식 {

	public static  void ShowInfo(Employee2 emp1) {
		//다운캐스팅을 통해서 parttimer or regular를 선별해서
		//모든 정보를 출력해보세요
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

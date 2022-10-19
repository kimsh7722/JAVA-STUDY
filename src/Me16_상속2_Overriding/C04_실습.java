package Me16_상속2_Overriding;

class Employee	//직원
{
	String name;
	String age;
	String addr;
	
	public Employee(String name, String age, String addr) {
		this.name=name;
		this.age=age;
		this.addr=addr;
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

class Parttimer	extends Employee//정규직
{	
	int hourpay;
	String salary;
	Parttimer(String name, String age, String addr,int hourpay, String salary) {
		super(name,age,addr);
		this.hourpay=hourpay;
		this.salary=salary;
	}
}

class Regular extends Parttimer//직급추가
{
	String salary;
	public Regular(String name, String age, String addr,int hourpay,String salary) {
		super(name,age,addr,hourpay, salary);
		this.salary=salary;
	}
}

public class C04_실습 {

	public static void ShowInfo(Employee emp) {
		//다운캐스팅을 통해서 parttimer or regular를 선별해서
		//모든 정보를 출력해보세요
		if(emp instanceof Parttimer) {
			Parttimer down =(Parttimer)emp;
			System.out.println("이름 : "+down.name+"\n"
					+ "나이 : "+down.age+"\n"
					+ "지역 : "+down.addr+"\n"
					+ "시간 : "+down.hourpay+"\n"
					+"직업 : "+down.salary);
		}
	
	}
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동","25","대구",20000,"태러범");
		Regular emp2 = new Regular("서길동","45","울산",50000000,"백수");
		ShowInfo(emp1);
		System.out.println("------------");
		ShowInfo(emp2);

	}
	//1 상속관계 만들기
	//2 적절한 생성자 만들기( super예약어 사용)
	//3 ShowInfo함수 안에서 Downcasting을 통해서 모든 멤버변수정보 출력하기
	
	
	
	
	
	
	
	

}

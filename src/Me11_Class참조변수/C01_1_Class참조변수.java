package Me11_Class참조변수;

class Controller {
	MemberInfo member;

	public MemberInfo getMember() {
		return member;
	}

	public void setMember(MemberInfo member) {
		this.member = member;
	}
	
}

class MemberInfo {
	String name;
	int age;
	String addr;
	
	public MemberInfo(String name, int age, String addr) {
		super();
		this.name=name;
		this.age=age;
		this.addr=addr;
	}
	
	
	@Override
	public String toString() {
		return "MemberInfo [name="+name+", age="+age+", addr"+addr+"]";
	}
}

public class C01_1_Class참조변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MemberInfo obj=new MemberInfo("홍길",55,"대구");
			Controller controller =new Controller();
			System.out.println("MemberInfo 객체 : "+obj.toString());
			
			controller.setMember(obj);
			MemberInfo tmp = controller.getMember();
			System.out.println("Controller : "+tmp);
			
	}

	

}

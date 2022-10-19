package Me16_상속2_Overriding;

class newSimple {
	int num1;
	public void sound() {System.out.println("Sound1()");}
}

class Sub extends newSimple {
	int num2; // 확장
	public void move() {System.out.println("Sub1 move1()");} //확장
	public void sound() {System.out.println("Sub1 Sound1()");}
}
public class C02_Overriding_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		정상범위 (Nocasting)
		newSimple ob1 = new newSimple();
		newSimple ob2 = new newSimple();
		ob1.sound();

//		Upcasting(상위클래스 참조변수 = 하위객체)
		System.out.println();
		Sub ob3= new Sub();
		ob3.sound();
		ob3.move();
	}

}

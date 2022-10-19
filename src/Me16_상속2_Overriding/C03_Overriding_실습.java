package Me16_상속2_Overriding;

class Super {
	int num1;
}
class SubCasting extends Super {
	int num2;
}

public class C03_Overriding_실습 {

	public static void main(String[] args) {
		
//		Nocasting
		Super ob1 = new Super();
		ob1.num1=100;
		System.out.println(ob1.num1);
		SubCasting ob2 = new SubCasting();
		ob2.num1=10; ob2.num2=20;
		System.out.println(ob2.num1+","+ob2.num2);
		
		
//		Upcasting(상위Class가 하위Class를 연결)
		Super ob3 = new SubCasting();
		ob3.num1=10;
//		ob3.num2=5; //참조변수를 찾지를 못함
		System.out.println(ob3.num1);
		
//		이에 사용되는 DownCastion
		SubCasting down = (SubCasting)ob3;
		down.num2=40;
		System.out.println(down.num2);
	}

}

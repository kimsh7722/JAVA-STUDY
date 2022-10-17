package Me9_1_함수이용;

class setSimple {
//	속성
	int x; double y; String str;
	char z; boolean b;
	
	setSimple() {
		System.out.println("디폴트 생성자 호출");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "setSimple [x="+x+", y="+y+", z="+z+", b="+b+", str:"+str+"]";
	}
}


public class C03_2_Mathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setSimple obj = new setSimple();
		System.out.println(obj.toString());
	}

}

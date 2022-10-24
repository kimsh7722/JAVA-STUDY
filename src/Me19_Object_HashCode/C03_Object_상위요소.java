package Me19_Object_HashCode;

class Pointer {
	int x; int y;
	Pointer(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}

public class C03_Object_상위요소 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pointer in1 = new Pointer(10, 20);
		Pointer in2 = new Pointer(10, 20);
		Pointer in3 = new Pointer(10, 20);
		System.out.println(in1.equals(in2));
		System.out.println(in1.equals(in3));
		System.out.println(in2.equals(in3));
	}

}

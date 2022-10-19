package Me15_상속1;

//	상위클래스, 하위클래스, 슈퍼클래스
class Point2D {
	int x; int y; 
	void showPoint() {
		System.out.printf("%d, %d\n",x,y);
	}
}

//	하위클래스
class Point3D extends Point2D {
	int z;
	void showPoint3D() {
		System.out.printf("%d %d %d\n",x,y,z);
	}
}

public class C01_상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D ob1 = new Point3D();
		ob1.x=10;
		ob1.y=20;
		ob1.showPoint();
		
		ob1.z=30;
		ob1.showPoint3D();
	}

}

package Me15_상속1;

class Parent {
	int x,y;
	
	Parent() {
		System.out.println("부모 호출");
	}
	
	Parent(int x) {
		this.x=x;
		
		System.out.println("자식 하나의 인자로 받앗을 때"+x);
	}
	
	Parent(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("자식 2개의 인자로 받앗을 때"+x+","+y);
	}
	
	Parent(int x, int y, int z) {
		this.x=x;
		this.y=y;
		System.out.println("자식 3개의 인자로 받앗을 때"+x+","+y+","+z);
	}
}

class Son extends Parent {
	int z;
	
	Son(int z) {
		super(z); // 상위클래스 디폴트 생성자 호출
		System.out.println("자식 호출 : "+x);
	}
	Son(int x,int y) {
		super(x,y); // 상위클래스 디폴트 생성자 호출
		System.out.println("자식 호출 : "+x+","+y);
	}
	
	Son(int x,int y, int z) {
		super(x,y,z); // 상위클래스 디폴트 생성자 호출
		this.z=z;
		System.out.println("자식 호출 : "+x+","+y+","+z);
	}
	
}
public class C02_상속_예습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son = new Son(10);
		Son son2 = new Son(20,30);
		Son son3 = new Son(20,30,50);
	}

}

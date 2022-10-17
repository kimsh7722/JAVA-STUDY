package Me09_1_함수이용;

class SimpleOver{
	int i; double d; char c; String str; boolean b; 
	SimpleOver() {}
	
//	Override 호출 2 -> 생성자에 매게변수 지정
	SimpleOver(int x) { // ov1,ov2
//		2-2 지역변수 x를 전역변수 i로 재대입
		this.i=x;
		System.out.println("SimpleOver 호출 : "+i);
	}
	
//	ov3
	SimpleOver(int x, double y){
		this.i=x; this.d=y;
	}
	
//	ov4
	SimpleOver(char a, String y) {
		this.c=a; this.str=y;
	}
	
//	Override : class 생성자에 매개변수에 받은 정보를 담아서 다시 호출시킨다
//	Override 호출 3 : 전역변수에 있는 변수를 return으로 다시 재호출
	@Override
	public String toString() {
		return "setSimple [\n"
				+ " int="+i+"\n"
				+ " double="+d+"\n"
				+ " char="+c+"\n"
				+ " boolean="+b+"\n"
				+ " String:"+str+"]";
	}
}

public class C03_3_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Override 호출 1 -> int 함수자리에 100입력
		SimpleOver ov1 = new SimpleOver(100);
		System.out.println("OV1 : "+ov1.i);
//		Override형태로 다시호출
		System.out.println(ov1.toString()+"\n");
		
		SimpleOver ov2 = new SimpleOver(0,20.5);
		System.out.println("OV2 : "+ov2.i+","+ov2.d);
		System.out.println(ov2.toString()+"\n");
		
		SimpleOver ov3 = new SimpleOver(10,15.5);
		System.out.println("Ov3 : "+ov3.i+","+ov3.d);
		System.out.println(ov3.toString()+"\n");
		
		SimpleOver ov4 = new SimpleOver('A',"장윤철");
		System.out.println("Ov4 : "+ov4.c+","+ov4.str+","+ov4.b);
		System.out.println(ov4.toString()+"\n");
	}


}

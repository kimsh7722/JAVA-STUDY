package Me15_상속1;

//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.


class TV{
	   private int size;
//	   private int color;
//	   public TV(int size, int color) {
//		   this.size = size; 
//		   this.color = color;
//	   }
//	   protected 상속한자만 데이터 재공
//	   protected int getSize() { return size; }
//	   protected int getColor() { return color; }
//	   void printProperty() {   
//		   System.out.println("화면 : "+size+"인치, 색깔 : "+color);
//	   }
	   
	   public TV(int size) {
	   this.size = size; }
	   protected int getSize() { return size; }
}

class ColorTV extends TV {
	
//	ColorTV(int x, int y) {
//		super(x,y);
//		System.out.println("TV요청");
//	}
	
//	변수만 요청식
	int size; int color;
	public ColorTV(int size, int color) {
		super(size);
		this.size=size;
		this.color=color;
		System.out.println("자료요청");
	}
	void printProperty() {
		System.out.println("화면 : "+size+"인치, 색깔 : "+color);
	}
}
public class C03_상속_실습 {

		public static void main(String[] args) { 
										//size // frame
			   ColorTV myTV = new ColorTV(32, 1024);
//			   myTV.printProperty();
			}
}

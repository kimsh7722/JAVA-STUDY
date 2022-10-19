package Me16_상속2_Overriding;

class Moonbanggu {
	public static int SharpenCnt=100;
	public static int PencilCnt=100;
	void write() {}
}

class Sharpen extends Moonbanggu {
	public Sharpen() {
		if(SharpenCnt >=1)
			SharpenCnt--;
	}
	void write() {System.out.println("샤프를 씁니다");}
}

class Pencil extends Moonbanggu {
	public Pencil() {
		if(PencilCnt >= 1) {
			PencilCnt--;
		}	
	}
	void write() {System.out.println("연필로 씁니다");}
}

public class C06_Upcasting활용 {
	public static void Writing(Moonbanggu item) {
		item.write();
	}
	public static void ShowInfo() {
		System.out.println("샤프재고량 : "+Moonbanggu.SharpenCnt+","+"연필 재교량 : "+Moonbanggu.PencilCnt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sharpen item1= new Sharpen();
		Pencil item2= new Pencil();
		
		Writing(item1);
		Writing(item2);
		ShowInfo();
			
		
	}

}

package Me17_추상화;

abstract class Moonbanggu {
	public static int SharpenCnt=100;
	public static int PencilCnt=100;
	abstract void write();
}

class Sharpen extends Moonbanggu {
	public Sharpen() {
		for(int i=1; i<SharpenCnt; i++) {
			if(SharpenCnt > i)
				SharpenCnt--;			
		}
	}
	void write() {System.out.println("샤프심이 : "+SharpenCnt+"남았습니다");}
}

class Pencil extends Moonbanggu {
	public Pencil() {
		for(int i=1; i<PencilCnt; i++) {
			if(PencilCnt > i) {
				PencilCnt--;
			}	
		}
	}
	void write() {System.out.println("연필이 : "+PencilCnt+"달앗습니다");}
}

public class C03_추상화방식_활용 {
	public static void Writing(Moonbanggu item) {
		item.write();
	}
	public static void ShowInfo() {
		System.out.println("샤프재고량 : "+Moonbanggu.SharpenCnt+"\n"
				+"연필 재교량 : "+Moonbanggu.PencilCnt);
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

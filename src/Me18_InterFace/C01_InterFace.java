package Me18_InterFace;

interface C01Remocon {
	
//	필드(final static)
	int MAX_VOLUMN=10;
	int MIN_VOLUMN=0;
	
//	기능(추상메서드)
	void trunOn();
	void trunOff();
	void setVolumn(int vol);
}

class TV implements C01Remocon{

	int vol;
	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void setVolumn(int vol) {
		// TODO Auto-generated method stub
		if(MAX_VOLUMN <= vol) {
			this.vol=MAX_VOLUMN;
		}else if(MIN_VOLUMN >= vol) {
			this.vol=MIN_VOLUMN;
		}else {
			this.vol=vol;
		}
		System.out.println("현재 TV Volumn : "+this.vol);
	}	
}

class Radio implements C01Remocon{

	int vol;
	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("Radio를 켭니다.");
	}
	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("Radio를 끕니다.");
	}
	
	@Override
	public void setVolumn(int vol) {
		// TODO Auto-generated method stub
		if(MAX_VOLUMN <= vol) {
			this.vol=MAX_VOLUMN;
		}else if(MIN_VOLUMN >= vol) {
			this.vol=MIN_VOLUMN;
		}else {
			this.vol=vol;
		}
		System.out.println("현재 Radio Volumn : "+this.vol);
	}
	
}

public class C01_InterFace {

	//	재정의후 출력
	public static void TurnOn(C01Remocon controller) {
		controller.trunOn();
	}
	//	재정의후 출력
	public static void TurnOFF(C01Remocon controller) {
		controller.trunOff();
	}
	public static void Setvol(C01Remocon controller,int num) {
		controller.setVolumn(num);
	}
	
	public static void main(String[] args) {

			TV tv= new TV();
			Radio radio = new Radio();
			
			TurnOn(tv);
			TurnOFF(tv);
			TurnOn(radio);
			TurnOFF(radio);
			Setvol(tv,7);
			Setvol(radio,11);
	}

}

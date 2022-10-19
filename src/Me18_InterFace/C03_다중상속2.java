package Me18_InterFace;

interface C02Remocon {
	
//	필드(final static)
	int MAX_VOLUMN=10;
	int MIN_VOLUMN=0;
	
//	기능(추상메서드)
	void trunOn();
	void trunOff();
	void setVolumn(int vol);
}

class TV01 implements C02Remocon{

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

class Radio01 implements C02Remocon{

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


// 다중 상속
interface SearchURL {
	void Search(String url);
}

class SmartTV extends TV01 implements SearchURL {
	
	public void Search(String url) {
		System.out.println(url+" 검색 시작합니다.");
	}
}

public class C03_다중상속2 {

	//	재정의후 출력
	public static void TurnOn(C02Remocon controller) {
		controller.trunOn();
	}
	//	재정의후 출력
	public static void TurnOFF(C02Remocon controller) {
		controller.trunOff();
	}
	public static void Setvol(C02Remocon controller,int num) {
		controller.setVolumn(num);
	}
	
	//	다중상속
	public static void Search(SearchURL product, String URL) {
		product.Search(URL);
	}
	
	public static void main(String[] args) {
		SmartTV tv = new SmartTV();
		TurnOn(tv);
		Setvol(tv,5);
		Search(tv,"www.naver.com");
	}

}

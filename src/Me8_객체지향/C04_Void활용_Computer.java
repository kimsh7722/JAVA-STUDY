package Me8_객체지향;

class Computer {
	String SerialNo;
	String CPUSpec;
	String RAMSpec;
	String DiskSpec;
	
	int eract; // eract=50
	
//	전원 켜기
	void PowerON() {
		if(eract == 0 ) {
			System.out.println("전력이 없습니다 현재 전력 : "+eract);
			
		}else {
			eract -=5;
			System.out.println("전원이 켜졋습니다 현재 전력량 : "+eract);
		}
	}
	
//	전원 끄기
	void PowerOFF() { 
		
		if(eract == 0) {
			System.out.println("전원이 꺼집니다 현재 전력양 : "+eract);
		}
	}
	
//	상세 정보
	void ShowInfo() { 
		System.out.println(
		"NO : "+SerialNo+"\n"+
		"CPU : "+CPUSpec+"\n"+
		"RAM : "+RAMSpec+"\n"+
		"DISK : "+DiskSpec+"\n"
		);
	}

}

public class C04_Void활용_Computer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Computer hard = new Computer();
		hard.SerialNo="1010";
		hard.CPUSpec="I7";
		hard.RAMSpec="16G";
		hard.DiskSpec="2TB";
		hard.eract=50;
		
		hard.ShowInfo();
		while(true) {
			if(hard.eract > 0) {
				hard.PowerON();
				Thread.sleep(500);
				
			}
			else if(hard.eract == 0){
				hard.PowerOFF();
				break;
			}
		}
	}

}

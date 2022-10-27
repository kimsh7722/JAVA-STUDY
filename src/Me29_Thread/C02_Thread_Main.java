package Me29_Thread;

public class C02_Thread_Main {

	public static void main(String[] args) {

		try {
			// 작업 스레드 객체 생성
			C02_Worker_1 worker1 = new C02_Worker_1();
			C02_Worker_2 worker2 = new C02_Worker_2();
			
			// 독립된 스레드 공간에 작업스레이드 전달
			Thread th1 = new Thread(worker1);
			Thread th2 = new Thread(worker2);
			
			// 스레드 실행
			th1.start();
			th2.start();
			
			for(int i=0; i<5; i++) {
				System.out.println("MAINTHREAD");
				Thread.sleep(800);
			}
		}catch (Exception e) {

		}
	}

}

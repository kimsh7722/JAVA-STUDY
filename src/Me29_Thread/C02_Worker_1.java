package Me29_Thread;

public class C02_Worker_1 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println("Worker1");
			try {Thread.sleep(500);}catch(Exception e) {e.printStackTrace();}
		}
	}
}

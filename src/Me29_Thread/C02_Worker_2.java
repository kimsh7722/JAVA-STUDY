package Me29_Thread;

public class C02_Worker_2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Worker2");
			try {Thread.sleep(500);}catch(Exception e) {e.printStackTrace();}
		}
		
	}

}

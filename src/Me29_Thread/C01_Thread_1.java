package Me29_Thread;

public class C01_Thread_1 {

	public static void main(String[] args) {

		/*
		 * 하나의 프로세서를 여러 프로세스 실행단위를 나누어 가능하게 만든다
		 * 메인[몸]과 작업[기능] 나눈다
		 */
		
		for(int i=0; i<5; i++) {
			System.out.println("TASK1");
			try {Thread.sleep(500);}catch(Exception e) {e.printStackTrace();}
		}
		for(int i=0; i<5; i++) {
			System.out.println("TASK2");
			try {Thread.sleep(500);}catch(Exception e) {e.printStackTrace();}
		}
	}

}

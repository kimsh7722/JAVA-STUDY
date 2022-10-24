package Me21_예외처리;

public class C01_Try_Cach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			String str=null;
			System.err.println(str.toString());
			
		
		}
//				┌Null값이 존재한다면 예외처리
		catch(NullPointerException e) {
//			예외 처리 방식
			System.out.println("예외 발생!");
			
//			발생 원인 가져오기
			System.out.println("----- e.getCause() -----");
			System.out.println(e.getCause());
			
//			예외객체 정보 표시
			System.out.println("----- e.toString() -----");
			System.out.println(e.toString());
			
//			예외객체 식별 주소
			System.out.println("----- e.getStackTrace() -----");
			System.out.println(e.getStackTrace());
		
//			프로그램 종료전 예외발생정보 출력
			System.out.println("----- e.printStackTrace() -----");
			e.printStackTrace();
		}
		System.out.println("실행코드 1");
		System.out.println("실행코드 2");
	}

}

package Me21_예외처리;

public class C02_배열예외처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
//						원래 배열의 순서는 0,1,2,3,4..시작하나 index는 12345시작한다
//						┌index : 배열의 요소위치값
		int arr[] = {10,20,30};
			for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
//		예외처리 상관없이 처리 
		finally {
			System.out.println("예외처리 상관없이 무조건 처리");
		}
		System.out.println("실행코드1");
		System.out.println("실행코드2");
	}

}

package Me14_Static;

class ShopService {
//	자 다시 정리[싱글톤 구현]
//	class가 가지고있는 매모리값을 인스턴스에 담다
	private static ShopService instance;
	
//	Class 생성자 정보은닉
	private ShopService() {}
	

//	싱글톤 기본
	public static ShopService getInstance() {
		if(instance == null) {
			instance = new ShopService();
		}
		return instance;
	}
}

public class C04_Static_Instance_예습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		객체가 다를지언정 인스턴스에 담은 매모리값을 비교한다
		ShopService obj1= ShopService.getInstance();
		ShopService obj2= ShopService.getInstance();

		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객채입니다");
		}else {
			System.out.println("다른 ShopService 객채입니다");
		}
	}

}

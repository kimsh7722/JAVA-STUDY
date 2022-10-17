package Me11_Class참조변수;
/* "???"이 'GS동성로점'에서 '콜라'를 구매한다
 * 객체
 * ??? - 고객
 * GS동성로점 - 편의점
 * 
 * 
 * Customer class
 * 속성 - 보유금액, 물건저장
 * 기능 - 구매하기(편의점)
 * 
 * store class
 * 속성 - 보유금액
 * 기능 - 물건제공(고객) : 돈받기, 물건 제공 승인
 * 
 */

// 구매자
class Customer {

	int myMoney;
	int colaCnt;

	Customer(int myMoney, int colaCnt) {
		super();
		this.myMoney = myMoney;
		this.colaCnt = colaCnt;
	}

//			2.	┌	전달받은 자
	void pay(Store store, int money) {
		/*
		 * 내보유금액에서 차감
		 * 지정된 판매자(store)에 금액을 전달
		 * 콜라갯수 누적
		 */
		myMoney -=money;
		int cnt = store.returnCola(money);
		colaCnt += cnt;
	}
}

//	판매자
class Store {
	

	int saveMoney;
	int colaCnt;
	int price;
	
//	3. 전달받은 2000원 
	int returnCola(int money) {
		/*
		 * 보유금액 누적
		 * 받은 금액만큼 콜라갯수 감수
		 * 고객한태 콜라 전달
		 */
		
		saveMoney += money;
		int cnt = money/price;
		colaCnt -= colaCnt;
		return cnt;
	}
	
	Store(int saveMoney, int colaCnt, int price) {
		super();
		this.saveMoney = saveMoney;
		this.colaCnt = colaCnt;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Store [saveMoney=" + saveMoney + ", colaCnt=" + colaCnt + ", price=" + price + "]";
	}
	
	
}

public class C01_2_Class참조변수_이해 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Class 불러와라
		Customer kim = new Customer(10000,0);
		Customer hun = new Customer(20000,0);
		Store store1 = new Store(100000,100,1000);
		Store store2 = new Store(100000,100,1000);
//							  saveMoney,cnt,price
//		구매자
		kim.pay(store1, 2000); // store에게 2000전달
		hun.pay(store2, 3000);
		System.out.println("------------- 고객정보 -------------");
		System.out.println(kim.toString());
		System.out.println(hun.toString());
		System.out.println("------------- 편의점 정보 -------------");
		System.out.println(store1.toString());
		System.out.println(store2.toString());
		
	}

}

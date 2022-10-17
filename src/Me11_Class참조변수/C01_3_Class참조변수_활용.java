package Me11_Class참조변수;


// 구매자
class Buyer {
	int myMoney; // 자가머니
	int appleCnt; // 사과를 가져온 갯수
	
//	구매자 정보저장
	Buyer(int getMoney, int getappleCnt) {
		super();
		this.appleCnt=getappleCnt; 	// [ 5000 ]
		this.myMoney=getMoney;		// [ 0 ]
	}
	
//		2.	구매자, 금액 부른다
	void pay(Seller seller, int getmoney) {
		myMoney-=getmoney; // 5000-2000
//		3. 구매자한태 지불금액전달 store에서 2000원 전달
		int getApple = seller.Store(getmoney);
//		9. 갯수 저장 [ 0+2 ]
		appleCnt += getApple;
	}
	
	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}
}

// 판매자
class Seller {
	int saveMoney; // 저장금액
	int appleCnt; // 사과를 판매남은 갯수
	int price; // 가지고있는 사과겟수
	
	
//	판매자 정보저장
	Seller(int getMoney, int getappleCnt, int getprice) {
		this.saveMoney=getMoney;	// [10000]
		this.appleCnt=getappleCnt;	// [100]
		this.price=getprice;		// [1000]
	}
	
//	4. 구매자로부터 받은 금액
	int Store(int getMoney) {
//		5. 받은 금액 누적[ 10000+2000 ]
		saveMoney+=getMoney;
//		6. 지불한 금액 / 판매자가 지정한 금액 [ 2000/1000 = 2 ]
		int count = getMoney/price;
		
//		7. 판매자가 가지고있는 사과갯수 차감 [ 100-2 ]
		appleCnt -= count;
//		8. 구매자한태 저달할 사과갯수[ 2 ] 
		return count; 
	}
	
	@Override
	public String toString() {
		return "Seller [saveMoney=" + saveMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}
	
}


public class C01_3_Class참조변수_활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer(5000,0);
//		구매자 = 소지금, 갯수
		
		Seller seller = new Seller(10000,100,1000);
//		해석 판매자 = 가지고있는 금액, 갯수, 가격
		
//		1. 구매자가 판매자한대 2000을 전달
		buyer.pay(seller, 2000);
		
//		10. 출력
		System.out.println("구매자가 보낼정보 : "+buyer.toString());
		
		
		System.out.println("판매자가 보낼정보 : "+seller.toString());
	}

}

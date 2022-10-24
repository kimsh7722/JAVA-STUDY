package 시험;

// 구매자
class C01Buyer {
	int myMoney;
	int AppleCnt;
	
	C01Buyer(int mymoney, int applecnt) {
		this.myMoney=mymoney;
		this.AppleCnt=applecnt;
	}
	
	public int pay(C01Seller seller, int i) {
		myMoney-=i;
		int cnt = seller.returnpay(i) ;
		AppleCnt+=cnt;
		return cnt;
	}
	
	void ShowInfo() {
		System.out.println("보유 금액 : "+myMoney+"\n"+"사과 개수 : "+AppleCnt);
	}
}

// 판매자
class C01Seller{
	int myMoney;
	int AppleCnt;
	int Price;
	
	C01Seller(int getMoney, int setApple, int price) {
		this.myMoney=getMoney;
		this.AppleCnt=setApple;
		this.Price=price;
	}
	
	public int returnpay(int getMoney) {
		myMoney+=getMoney;
		int cnt=getMoney/Price;
		AppleCnt-=cnt;
		return cnt;
	}
	
	void ShowInfo() {
		System.out.println("보유금액 : "+myMoney+"\n"+"사과개수 : "+AppleCnt+"\n"+"개당가격 : "+Price);
	}
}

public class C02_시험2번 {

	public static void main(String[] args) {

		C01Seller seller = new C01Seller(100000,100,1000);
		C01Buyer buyer01 = new C01Buyer(10000,0);
		C01Buyer buyer02 = new C01Buyer(20000,0);
		C01Buyer buyer03 = new C01Buyer(30000,0);
		
		buyer01.pay(seller,2000);
		buyer02.pay(seller,5000);
		buyer03.pay(seller,3000);
		System.out.println("---판매자 정보---");
		seller.ShowInfo();
		System.out.println("---구매자 정보---");
		System.out.println("-buyer01-");
		buyer01.ShowInfo();
		System.out.println("-buyer02-");
		buyer02.ShowInfo();
		System.out.println("-buyer03-");
		buyer03.ShowInfo();
	}

}

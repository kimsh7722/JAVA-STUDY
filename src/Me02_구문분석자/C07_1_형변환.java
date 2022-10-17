package Me02_구문분석자;

public class C07_1_형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자료 형변환
		 * 	특정 자료형이 다른자료형으로 변환되어지거나 강제로 변환시키는 문법
		 * 	데이터 손실의 최소화가 목정
		 * 
		 * 최소화 순서
		 * byte > short > int > long > float > double > boolean
		 * 종류
		 * 	자동형변환(암시적) : 컴파일러에 의해 자동 형변환
		 * 	강제형변환(명시적) : 프로그래머에 의해 강제 형변환
		 * 
		 * 자동 형변환
		 *  - byte num1 = 10;
		 *  int num2 = num1 : num1에 있는 수가 num2의 int형으로 자동형변환시킨다
		 *  
		 *  강제 형변환
		 *  byte num1 = 10;
		 * 	 int num2 =(char)num1; char형으로 강제로 형변환
		 * */
		
		byte num1= 10;
		char num2='A';
		int num3 = num2;
		System.out.println("변환 : "+num3);
	}

}

package CH01;

public class C01_OutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 메서드(방법,기능) : 여러코드들을 묶어서 실행,특정 기능 수행, C언의 함수개념과 유사
		메인 메서드		: 최초 실행되는 함수 
		라이브러리 메서드	: 미리 만들어져 제공되는 함수
		사용자 정의 메서드: 개발자에 의해 제작되는 함수
			Escape
			- \n : 다음줄
			- \t : 탭문자
			- \\ : 역슬러쉬
			- \' :홀따옴표
			- \" : 쌍따옴표출력
			- \b : 백스페이스 (C언어)
		*/
		
		/*
		 * System.out.printf() - format  : 형식, 서식
		 * - 서식문자를 사용할 수 있는 출력메서드
		 * 	└서류를 꾸미는 양식
		 * %d : 정수 출력
		 * %f : 실수 출력
		 * %c : 한문장 출력
		 * %s : 문자열 출력
		 */
//		System.out.printf();
//		System.out.printf("%d %d %d \n",10,20,30);
//		System.out.printf("%f %f %f \n",10.1,20.1,30.1);
//		System.out.printf("%c %c %c \n",'A','B','C');
//		System.out.printf("%s %s %s \n","this si","String","Test");
//		System.out.printf("%d.%s : %d\n",1,"국어",100);
		
		System.out.printf("%c%c\t\t%c%c\t\t%c%c\t\t%c%c\n",'N','O','이','름','나','이','주','소');
		System.out.printf("%d\t\t%s\t %d\t\t%s\n",1,"김광수",35,"대구 ");
		System.out.printf("%d\t\t%s\t %d\t\t%s\n",2,"이태수",55,"울산 ");
		System.out.printf("%d\t\t%s\t %d\t\t%s\n",3,"신성아",25,"김해 ");
		
//		Println 
		
	}

}

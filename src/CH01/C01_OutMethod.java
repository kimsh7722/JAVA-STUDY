package CH01;

public class C01_OutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			Escape
			- \n : 다음줄
			- \t : 탭문자
			- \\ : 역슬러쉬
			- \' :홀따옴표
			- \" : 쌍따옴표출력
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
	}

}

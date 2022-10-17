package Me13_Class배열;

public class C02_ClassVa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("배열 길이 : "+args.length);
		for(String str : args) {
			System.out.println(str);
		}
		/*
		 * 1번째 방법 
		 * 	: Run As -> Run configurations -> 
		 * 	  args에 지정된 파일 -> Arguments 클릭 ->
		 *    Program arguments 박스 적기
		 * 
		 * 2번째 방법
			Properties -> Resource에 있는 location 박스 클릭 -> 
			Arguments지정된 파일누른상태에서 검책창에 cmd -> 
			javac C02_ClassVa.java를 .class로 파일로바꾼다
			-> java 경로.C02_ClassVa 실행
		 */
	}

}

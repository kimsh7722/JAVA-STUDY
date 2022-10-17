package Me10_접근한정자;

import java.util.Scanner;

public class C04_String_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alength, blength;
		char achar, bchar;
		
		String st1 = new String("java PowerFul");
		String st2 = new String("java Programming");
		String st3 = st1 + st2;
		System.out.println(st3);
		
		alength = st1.length();
		blength = st2.length();
		
		achar = st1.charAt(5);
		bchar = st2.charAt(10);
		
		System.out.println("St1에 저장 = "+st1+"길이 = "+alength);
		System.out.println("St2에 저장 = "+st2+"길이 = "+blength);
		System.out.println("St1에 5번쨰 문자 = "+achar);
		System.out.println("St1에 10번쨰 문자 = "+bchar);
		System.out.println("Str1의 대문자로 변환 : "+st1.toUpperCase());
		System.out.println("Str1의 소문자로 변환 : "+st1.toLowerCase());
		System.out.println("Str2의 a를 A로 변환 : "+st2.replace('a','A'));
		System.out.println();
		
		// trim(), subString()
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		System.out.println(tmp);
		System.out.println(tmp.trim());
		
//		subString() : 문자열 자르기
//		System.out.println(tmp.substring(2));
		
//		시작위치 배열 2번부터, 끝나는 위치 전5까지 
//		System.out.println(tmp.substring(2,5));
		
//		배열중에서 해당하는 위치찾아 배열번호로 나타내라 
		System.out.println(tmp.indexOf('h'));
//		해당 배열중 마지막에 해당하는 것을 번호로 나타내라
		System.out.println(tmp.lastIndexOf('h'));
		
//		시험 contains 문자열 포함 여부를 참,거짓 확인
		System.out.println(tmp.contains("hfe"));
		
//		split("구분자") : 구분자를 기준으로 문자열을 분할(배열형으로저장)
		String arr[] = tmp.split(" ");
		for(int i=0; i < arr.length; i++) {
			System.out.println("arr["+i+"]"+"="+arr[i]+"\n");
		}
	}
}

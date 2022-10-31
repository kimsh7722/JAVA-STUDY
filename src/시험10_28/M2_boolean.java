package 시험10_28;
import java.util.Scanner;


public class M2_boolean {

	public static boolean Incontain(String str, String[] text) {
		for(int i=0; i < text.length; i++) {
			if(text[i].contains(str)) {
				System.out.println(str+" 포함 여부 : true");
				return true;
			}else {
				System.out.println("값이 없어 다시 검색하라");
			}
		}
		System.out.println(str+" 포함 여부 : false");
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			
		String[] text = new String[3];
		String str=null;
		for(int i=0; i < 3; i++) {
			System.out.print((i+1)+" 문자열을 입력하세요 : ");		
			text[i]= sc.nextLine();
		}
		System.out.print("찾을 문자열 입력하세요 : ");
		str = sc.nextLine();
		Incontain(str, text);
		
	}
}

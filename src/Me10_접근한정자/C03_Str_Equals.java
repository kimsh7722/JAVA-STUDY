package Me10_접근한정자;

public class C03_Str_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "java";
		String str2 = "java";
		
		String str3 = new String("java");
		String str4 = new String("java");
		
//		String을 주소로 지정햇을 때 그안의 내용물확인하여 비교
		System.out.println("equals : "+str3.equals(str4));
		System.out.println("equals : "+str1.equals(str2));
		System.out.println("equals : "+str1.equals(str3));
		
//		서로가 변수값을 가진상태에서 비교
		System.out.println("str1 = str2 : "+(str1==str2));
		System.out.println("str3 = str4 : "+(str3==str4));
		System.out.println("str1 = str3 : "+(str1==str3));
		System.out.println("str1 = str4 : "+(str1==str4));
	}

}

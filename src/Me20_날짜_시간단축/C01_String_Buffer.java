package Me20_날짜_시간단축;

import javax.sound.midi.SysexMessage;

public class C01_String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "World";
		str1 = str1.concat(str2);
		System.out.println(str1);
		
		System.out.println("str1 : "+System.identityHashCode(str1));
		System.out.println("str2 : "+System.identityHashCode(str2));
		
		int start = (int)System.currentTimeMillis();
		System.out.println("Start : "+start+"ms");
		
		String str="";
//		1. string concat함수나 +연산자를 통한 문자열 덧붙이기
		for(int i=0; i < 10000; i++) {
			str+="H";
		}
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i < 100000; i++) {
			buffer.append("H");
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : "+(end-start)+"ms");
		System.out.println(buffer);
	}

}

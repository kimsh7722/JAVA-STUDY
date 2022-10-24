package Me20_날짜_시간단축;

import java.util.ArrayList;
import java.util.List;

public class C02_Boxing {

	public static void main(String[] args) {

//		Boxing(자료 -> Integer정수형 객채로 변환)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
//		UnBoxing(Integer자료 -> 일반자료형)
		int value1 = obj1.intValue();
		int value2 = obj1.intValue();
		int value3 = obj1.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
//		자동 Boxing
		Integer obj=100;
		int n1 = obj+10;
		System.out.println("결과 : "+n1);
		
//		<> 재너릭 문법, List 컬랙션
		List<Integer> list = new ArrayList();
	}

}

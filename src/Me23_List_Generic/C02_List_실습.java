package Me23_List_Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class C02_List_실습 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		int num;
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("=======M E N U =======");
			System.out.println("1 이름 등록");
			System.out.println("2 이름 조회");
			System.out.println("3 이름 삭제");
			System.out.println("4 전체 조회");
			System.out.println("5 종료");
			System.out.println("=======M E N U =======");
			System.out.print("번호 : " );
			num = sc.nextInt();
			
//			실험해본결과 계속 완료대면 아예 저장한객체가 초기화된다
			switch(num) {
			case 1:
				System.out.print("이름 : ");
				String name=sc.next();
				list.add(name);
//				list.contains(name); // 이름이 중복되었나 확인
				break;
				
			case 2:
				System.out.print("조회 : ");
				name=sc.next();
				if(list.contains(name)) {
					System.out.println("검색결과 "+name+"이존재합니다");					
				}
				System.out.println("INDEX : "+list.size());
				break;
			case 3:
				System.out.print("제거대상 : ");
				name=sc.next();
				if(list.contains(name)) {
					list.remove(name);					
				}
				for(int i=0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				System.out.println("삭제하엿습니다");
				break;
			case 4:
				for(int i=0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
//				for(String tmp : list) {
//					System.out.println(tmp);
//				}
				break;
			case 5:
				System.exit(-1);
			default :
				System.out.println("다시입력");
			}
		}

	}

}

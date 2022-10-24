package 시험;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class C02Prac {

	public static void main(String[] args) {
	
		int num = 0;
		//Map 만들기
		Map<String,String> map = new HashMap();
		// 조회
		Set<String> set = map.keySet();
		Scanner sc = new Scanner(System.in);
		String id=null;
		String pw=null;
		while(true) {
			System.out.println("=======M E N U =======");
			System.out.println("1 ID/PW 등록");
			System.out.println("2 ID/PW 조회");
			System.out.println("3 Password 변경");
			System.out.println("4 ID/PW 삭제");
			System.out.println("5 전체조회");
			System.out.println("6 종료");
			System.out.println("=======M E N U =======");
			System.out.print("번호 : " );
			num = sc.nextInt();
			switch(num)
			{
			case 1:
				//map 에 ID/PW등록
				//단! 기존에 동일 ID가 있으면 등록불가(containsKey사용)
				System.out.print("ID 입력 : "); id=sc.next();
				System.out.print("PW 입력 : "); pw=sc.next();
				if(!map.containsKey(id)) {
					map.put(id, pw);
				}else {
					System.out.println("동일한 ID가 존재한다");
				}
				break;
			case 2:
				//ID를 받아서 map에 있는 동일한 Id/pw 를 출력
				System.out.print("ID 입력 : "); id=sc.next();
				if(map.containsKey(id)) {
//					Set<String> pwd = set;
					String pwd = map.getOrDefault(id, pw);
					System.out.println("조회한 대상자의 패스워드는 "+pwd+" 입니다");
				}else {
					System.out.println("ID조회 실패했습니다");
				}
				break;
			case 3:
				//ID를 받아서 map에 있는 동일한 id의 password를 변경 
				System.out.print("ID 입력 : "); id=sc.next();
				if(map.containsKey(id)) {
					System.out.print("PW 입력 : "); pw=sc.next();
					map.put(id, pw);
					System.out.println(id+"의 패스워드를 "+pw+" 변경합니다");
				}else {
					System.out.println("ID조회 실패했습니다");
				}
				break;
			case 4:
				//ID를 받아서 map에 있는 동일한 id/pw를 삭제
				System.out.print("ID 입력 : "); id=sc.next();
				if(map.containsKey(id)) {
					map.remove(id);
					System.out.println(id+"사용자 정보를 삭제합니다");
				}else {
					System.out.println("삭제 실패했습니다");
				}
				break;
			case 5:
				//전체조회
				for(String key : set) {
					String value = map.get(key);
					System.out.println("ID : "+key+" // PW : "+value);
				}
				break;
			case 6:
				System.exit(-1);
			default:
				System.out.println("다시 입력...");
			}
		
		}
		
		
		
		
		
		
	}

}

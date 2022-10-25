package Me24_파일입출력;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class C04_정리 {
	
	private static Map<String,String> map = new HashMap();

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int num;
		String subject; String contends = null;
		
		
		while (true) {
			System.out.println("-----------M E M O-----------");
			System.out.println("1 메모하기");
			System.out.println("2 불러오기");
			System.out.println("3 파일로 저장");
			System.out.println("4 종료");
			System.out.println("-----------M E M O-----------");
			System.out.print("번호 : ");
			num = sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.print("제목 입력 : " ); //map의 key로 저장
				subject=sc.next();
				
				//기존의 제목과 동일한 제목이 있으면 내용입력이 불가능하게 설정합니다
				if(map.containsKey(subject)) // 동일 제목이 있을 경우
				{
					System.out.println("기존 제목과 동일한 제목이 있습니다");
					break;
				}
				sc.nextLine();				
				System.out.println("----내용----");//map의 value로 저장
				contends=sc.next();
				
				while(true) {
					String tmp = sc.nextLine();
					if(tmp.contains("-1")) {
						break;
					}
					contends+=tmp;
					System.out.println("contends 값 : "+contends+" tmp 값 : "+tmp);
				}
				
				//제목과 내용을 입력 받아서 map에 저장합니다
				map.put(subject, contends);
				break;
				
			// 해당 제목을 조회하여 내용을 불러와라
			case 2:
				System.out.println("조회 구간입니다");
				//제목을 입력하면 해당 제목의 내용일 출력되게 합니다.
				System.out.print("제목 입력 : " );
				subject=sc.next();
				if(map.containsKey(subject)) {
					String result = map.get(subject);
					System.out.println("내용 : "+result);
				}
				break;
				
			// 파일 보내기
			case 3:
				System.out.println("파일 보내기 목록창입니다");
				Set<String> set = map.keySet();
				int i=1;
				for(String k : set) {
					//제목 리스트마다 번호를 부여해서 번호를 입력하면 파일로 저장되게 합니다
					System.out.println((i++)+"번 파일제목 : "+k);
				}
				
				//map의 제목 리스트가 나오게 합니다
				System.out.print("제목검색 : "); 
				subject=sc.next();
				contends = map.get(subject);
				
				Date now = new Date();
				//파일명도 받아서 처리합니다
				Writer out = new FileWriter("c:\\IoText\\"+subject+".txt");
				out.write("-----"+now+"-----\n");
				out.write(contends); 
				out.flush(); // 버퍼 초기화 
				out.close(); // 닫아버려라
				break;
			case 4:
				System.out.println("종료합니다.");
				System.exit(-1);
				
			default : 
				System.out.println("다시 입력하세요..");	

			}
		}

	}
}

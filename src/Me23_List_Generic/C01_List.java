package Me23_List_Generic;

import java.util.ArrayList;
import java.util.List;

public class C01_List {

	public static void main(String[] args) {

		List<String> list = new ArrayList();
		
//		추가
		list.add("JAVA");			// 0
		list.add("JDBC");			// 1
		list.add("Oracle DB");		// 2
		list.add("JSP");			// 3
		list.add("Servlet");		// 4
		list.add("SpringFramWork");	// 5
		list.add("JAVA");			// 6
		
//		확인(저장 수)
		System.out.println("총 개체수 : "+list.size());
		
//		조회(요소)
		System.out.println("확인 IDX 2 : "+list.get(2));
		
//		전체 조회
		System.out.println("------- 전체 조회1 -------");
		for(int v=0; v <= list.size(); v++) {
			System.out.println(list.get(v));
		}
		System.out.println("------- 전체 조회2 -------");
		for(String tmp : list) {
			System.out.println(tmp);
		}
//		삭제
		list.remove(2);
		System.out.println("------- 삭제 -------");
		for(String tmp : list) {
			System.out.println(tmp);
		}
		list.clear();
	}

}

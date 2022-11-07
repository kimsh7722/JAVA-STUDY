package Me26_DB;

import java.util.List;
import java.util.Scanner;


public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = MemberDAO.getInstance();
		
//		String email=sc.nextLine();
//		String addr=sc.nextLine();
//		String phone=sc.nextLine();
		
		// 삽입 출력
//		dao.Insert(new MemberDTO(email,addr,phone));
//		System.out.println("가입 정보 재확인 : "+dao);
		
		// 삭제 출력 : 생성자로부터 순서가 중요한듯..
//		dao.Update(new MemberDTO("kys6763@doum.com","남산","070-554-6675"));
		
		// 조회
		List<MemberDTO> list = dao.SearchAll();
		for(MemberDTO dto : list) {
			System.out.println(dto);
		}
	}

}

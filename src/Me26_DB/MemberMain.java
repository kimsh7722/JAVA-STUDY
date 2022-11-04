package Me26_DB;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		String email=sc.nextLine();
		String addr=sc.nextLine();
		String phone=sc.nextLine();
		// 삽입
		dao.Insert(new MemberDTO(email,addr,phone));
		System.out.println("가입 정보 재확인 : "+dao);
	}

}

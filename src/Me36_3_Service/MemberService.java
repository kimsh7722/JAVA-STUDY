package Me36_3_Service;

import Me36_2_Domain.MemberDAO;
import Me36_2_Domain.MemberDTO;

public class MemberService {

	private MemberDAO dao = MemberDAO.getInstance();

	// 싱글톤 패턴 코드 추가
	private static MemberService instance;

	public static MemberService getInstance() {
		if (instance == null)
			instance = new MemberService();
		return instance;
	}

	private MemberService() {
	}

	
	// 멤버 등록하기
	public boolean RegisterMember(MemberDTO dto) {	
			int result = dao.Insert(dto);
				if(result>0)
					return true;
		return false;
	}
	
	//도서 수정하기
	//도서 삭제하기
	//기타..
}

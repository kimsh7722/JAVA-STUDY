package Me36_3_Service;

import Me36_2_Domain.MemberDAO;
import Me36_2_Domain.MemberDTO;

public class AuthService {

	private MemberDAO dao = MemberDAO.getInstance();

	// 싱글톤 패턴 코드 추가
	private static AuthService instance;

	public static AuthService getInstance() {
		if (instance == null)
			instance = new AuthService();
		return instance;
	}

	private AuthService() {}

	// (ID/PW 인증 이후 Role 전달) 
	public Integer LoginCheck(String id,String pwd) {
		
		MemberDTO dto=null;
		dto = dao.Select(id);
		
		if(dto==null) {
			return null;
		}
		//ID 일치 PW일치여부 확인 
		if(id.equals(dto.getMemId())&&pwd.equals(dto.getPwd()))
		{
			return dto.getRole();
		}
		//role반환(1 or 2 or Null)
		return null;
	}
	
	
	
	
	//도서 수정하기
	//도서 삭제하기
	//기타..
}

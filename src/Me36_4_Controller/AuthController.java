package Me36_4_Controller;

import Me36_2_Domain.DTO;
import Me36_2_Domain.MemberDTO;
import Me36_3_Service.AuthService;

public class AuthController implements SubController {
	private AuthService service = AuthService.getInstance();
	
	@Override
	public Object excute(int SN, DTO dto) {

		// 1 로그인 2 로그아웃 3 권한검증..
		
		//1) 파라미터 받기
		//2) 입력값검증(Validation)
		//3) 서비스 요청
		//4) View 전달
		switch (SN) {
		case 1:
			MemberDTO down = (MemberDTO)dto;
			String id=down.getMemId();
			String pwd=down.getPwd();
			if(id!=null && pwd!=null) {
				return service.LoginCheck(id, pwd); //null or role값
			}
			break;
		case 2:
			break;
		case 3:
			break;
		default:

		}
		return null;
	}

}

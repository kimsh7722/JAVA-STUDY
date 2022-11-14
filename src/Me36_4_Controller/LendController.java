package Me36_4_Controller;

import Me36_2_Domain.DTO;
import Me36_2_Domain.LendDTO;
import Me36_3_Service.LendService;

public class LendController implements SubController {

	LendService service = LendService.getInstance();
	
	// 1 대여 2 반납 ..
	@Override
	public Object excute(int SN, DTO dto) {
		Object r=null;
		switch (SN) {
		case 1: // 대여
			LendDTO down = (LendDTO)dto;
			boolean result = service.Lendbook(down);
			if(result) {
				r="대여성공!";
			}else {
				r="대여실패!";
			}
			
			break;
		case 2:
			break;
		case 3:
			break;
		default:
		}

		return r;
	}

}

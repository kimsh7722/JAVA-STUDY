package Me26_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// Eclipse JAVA를 Oracle연동하여 DB정보를 넘기는 작업
public class MemberDAO {

	String id = "SYSTEM";
	String pw = "1234";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	MemberDAO() {
		// CONN 객체 연결
		try {
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("Connected...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 멤버 가입하기
	boolean Insert(MemberDTO dto){
		int result = 0;
		try {
			
			pstmt = conn.prepareStatement("insert into tbl_member values(member_seq.NEXTVAL,?,?,?)");
			pstmt.setString(1, dto.getEmail());
			pstmt.setString(2, dto.getAddr());
			pstmt.setString(3, dto.getPhone());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close();} catch (Exception e2) {e2.printStackTrace();}
		}
		if(result != 0) {
			System.out.println("가입 성공");
			return true;
		}else {
			System.out.println("가입 실패");
		}
		return false;
	}
	
	// 멤버 수정하기
//	boolean Update(email,addr,phone) {
//			
//	}
	
	// 멤버 삭제하기
//	boolean Delete(email) {
//		
//	}
	
	// 멤버 조회하기
//	boolean Select(email) {
//		
//	}
	
	// 멤버 수 확인하기
//	boolean Count(email,addr,phone) {
//		
//	}
	
	// 자원 연결 해제하기
//	boolean (email,addr,phone) {
//		
//	}
}

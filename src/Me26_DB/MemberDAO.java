package Me26_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// Eclipse JAVA를 Oracle연동하여 DB정보를 넘기는 작업
public class MemberDAO {

	String id = "SYSTEM";
	String pw = "1234";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private static MemberDAO instance;
	public static MemberDAO getInstance() {
		if(instance == null) 
			instance = new MemberDAO();
			
		return instance;
	}
	private MemberDAO() {
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
	boolean Update(MemberDTO dto) {
			int result=0;
			try {
				String sql = "update tbl_member set addr=?,phone=? where email=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dto.getAddr());
				pstmt.setString(2, dto.getPhone());
				pstmt.setString(3, dto.getEmail());
				result = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {pstmt.close();} catch (Exception e2) {e2.printStackTrace();}
			}
			if(result > 0) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
			}
			return false;
	}
	
	// 멤버 삭제하기
//	boolean Delete(MemberDTO dto) {
//		int result;
//		try {
//			String sql = "delete from [] where []";
//			pstmt=conn.prepareStatement(sql);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	// 멤버 조회하기
//	boolean Select(email) {
//		
//	}
	
	// 멤버 수 확인하기
	List<MemberDTO> SearchAll() {
		List<MemberDTO> list = new ArrayList();
		MemberDTO dto = null;
		try {
			pstmt = conn.prepareStatement("select * from tbl_member");
			rs = pstmt.executeQuery();
			if(rs != null ) {
				while(rs.next()) {
				dto = new MemberDTO();
				dto.setEmail(rs.getString(1));
				dto.setAddr(rs.getString(2));
				dto.setPhone(rs.getString(3));
				list.add(dto);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {pstmt.close();}catch (Exception e) {
				e.printStackTrace();}
			try { rs.close();}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	// 자원 연결 해제하기
//	boolean (email,addr,phone) {
//		
//	}
}

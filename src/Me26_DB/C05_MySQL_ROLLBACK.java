package Me26_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C05_MySQL_ROLLBACK {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String id="root";
		String pw="1234";
		String url="jdbc:mysql://localhost:3306/shop";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		
		// 연결접속 확인 try
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver 연결완료!!");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("MySQL 연결중...");
			
			// Commit 해제 - Rollback 실행하기위해서 Commit해재해야만한다
			// Commit하게대면 지정한것은 변경이 불가능하다
			conn.setAutoCommit(false);
//			pstmt=conn.prepareStatement("insert into tbl_customer(name,addr,phone) values(?,?,?)");
//			pstmt.setString(1, "크로우");
//			pstmt.setString(2, "야생");
//			pstmt.setString(3, "???-????-????");
//			
			int result = pstmt.executeUpdate();
//			if(result != 0) {
//				System.out.println("삽입완료");
//			}else {
//				System.out.println("실패");
//			}
			
			pstmt=conn.prepareStatement("delete from tbl_customer where id=11");
			
			result = pstmt.executeUpdate();
			if(result != 0) {
				System.out.println("삭제완료");
			}else {
				System.out.println("실패");
			}
			
			// Commit 실행
			conn.setAutoCommit(true);
			
		}catch(Exception e) {
			
			// 전의 실행취소 
//			try { conn.rollback(); System.out.println("RollBack!!!");
//			}catch(Exception k) {k.printStackTrace();}
			e.printStackTrace();
		}finally {
			try { pstmt.close(); }catch(Exception e) {e.printStackTrace();}
			try { conn.close(); }catch(Exception e) {e.printStackTrace();}
		}
				
	}

}

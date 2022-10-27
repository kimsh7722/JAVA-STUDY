package Me26_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C03_MySQL_UPDATE {

	public static void main(String[] args) {

		// DB 정보 담기
		String id = "root"; // DB Id 연결
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/shop";
				
		// DB연결객체 관련 참조변수 ReactDB연결로 치면 
		Connection conn = null;			//DB연결객체용 참조변수 // express 연결
		PreparedStatement pstmt = null;	//SQL쿼리 전송객체용 참조변수 // app.process.env.PORT || 4000
		ResultSet rs = null;			//쿼리결과(Select결과)수신용 참조변수 // mysql Select
				
		try {
			// DB드라이버
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success!!");
			// DB정보담는 걸 DB드라이버 조회
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB Connected...");
					
			// MySQL 갱신문
			pstmt = conn.prepareStatement("update tbl_customer set addr=? where id=?");
			pstmt.setString(1, "마산");
			pstmt.setInt(2, 3);
					
			// DB 실행
			int result = pstmt.executeUpdate();
			if(result != 0) {
				System.out.println("Update 성공");
			}else {
				System.out.println("Update 실패");
			}
			
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					conn.close();}catch(Exception e) {e.printStackTrace();}	
			}
	}

}

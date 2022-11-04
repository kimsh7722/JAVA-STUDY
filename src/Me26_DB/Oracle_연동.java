package Me26_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Oracle_연동 {

	public static void main(String[] args) {

		String id = "SYSTEM";
		String pw = "1234";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("접속완료..");
			// 													 ┌시퀀스 적용
//			pstmt = conn.prepareStatement("insert into ? values(emp_seq.NEXTVAL,?)");
//			pstmt.setInt(?);
//			pstmt.setString(?);
			int result = pstmt.executeUpdate();
			if(result != 0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

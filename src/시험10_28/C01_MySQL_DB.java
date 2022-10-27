package 시험10_28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C01_MySQL_DB {

	public static void main(String[] args) {
		
		String id="root"; String pw="1234";
		String url="jdbc:mysql://localhost:3306/databases";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			// DB 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DB 연결 완료");
			DriverManager.getConnection(url,id,pw);
			System.out.println("연결 진행중...");
			
			// 삽입문
			
			// 삭제문
			
			// 갱신문
			
			// Query문
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

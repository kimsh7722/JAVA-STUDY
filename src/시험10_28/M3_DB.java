package 시험10_28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class M3_DB {

	public static void main(String[] args) {

		// 연결관련 정보
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/tmpdb";
		String user="root";
		String pwd="1234";
		
		// 연결객체 참조변수
		String sql="select * from student_tbl";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			// 드라이브 적재
			Class.forName(driver);
			System.out.println("Driver Loading Success");
			// Connection 객체 생성 conn에 연결
			conn = DriverManager.getConnection(url,user,pwd);
			System.out.println("DB Connected...");
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
				System.out.print(rs.getString("id")+" ");
				System.out.print(rs.getString("name")+" ");
				System.out.print(rs.getInt("age")+" ");
				System.out.println(rs.getString("addr")+" ");
				}
			}else {
				System.out.println("실패");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}

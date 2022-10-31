package Me01;

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
			
//			pstmt = conn.prepareStatement("insert into student_tbl(id,name,age,addr) values(?,?,?,?)");
//			pstmt.setString(1, "aaa");
//			pstmt.setString(2, "홍길동");
//			pstmt.setInt(3,40);
//			pstmt.setString(4,"대구");
//			int result = pstmt.executeUpdate();
//			if(result != 0) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
//			
//			pstmt = conn.prepareStatement("insert into student_tbl(id,name,age,addr) values(?,?,?,?)");
//			pstmt.setString(1, "bbb");
//			pstmt.setString(2, "남길동");
//			pstmt.setInt(3,30);
//			pstmt.setString(4,"울산");
//			result = pstmt.executeUpdate();
//			if(result != 0) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
//			
//			pstmt = conn.prepareStatement("insert into student_tbl(id,name,age,addr) values(?,?,?,?)");
//			pstmt.setString(1, "ccc");
//			pstmt.setString(2, "김철수");
//			pstmt.setInt(3,35);
//			pstmt.setString(4,"서울");
//			result = pstmt.executeUpdate();
//			if(result != 0) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
//			
//			pstmt = conn.prepareStatement("insert into student_tbl(id,name,age,addr) values(?,?,?,?)");
//			pstmt.setString(1, "ddd");
//			pstmt.setString(2, "서영희");
//			pstmt.setInt(3,34);
//			pstmt.setString(4,"김해");
//			result = pstmt.executeUpdate();
//			if(result != 0) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
			
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

package Me36_2_Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {

	// 연결관련 정보 저장용 변수
	String id = "root"; // DB연결 id
	String pw = "1234"; // DB연결 pw
	String url = "jdbc:mysql://localhost:3306/libdb"; // 연결URL(DBMS마다 상이함)

	// DB연결객체 관련 참조변수
	Connection conn = null; // DB연결객체용 참조변수
	PreparedStatement pstmt = null; // SQL쿼리 전송객체용 참조변수
	ResultSet rs = null; // 쿼리결과(Select결과)수신용 참조변수

	DAO() {
		// CONN객체 연결
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("Connected...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

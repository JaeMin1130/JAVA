package SQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqlConnection {
	public static void main(String[] args) throws SQLException {

		// mySQL이랑 연결
		String driver = "com.mysql.cj.jdbc.Driver";
		// 데이터 베이스 경로
		String url = "jdbc:mysql://localhost:3306/world"; // 로컬 서버
		String userName = "Iru";
		String password = "11300315";

		Connection con = DriverManager.getConnection(url, userName, password);

		try {
			// 메모리에 driver load
			Class.forName(driver);
			System.out.println("Connection Success");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

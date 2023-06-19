package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JDBCconnect1 {
	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	// 생성자
	public JDBCconnect1() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/musthave";
			String id = "musthave";
			String pwd = "11300315";
			con = DriverManager.getConnection(url, id, pwd);
			
			System.out.println("DB 연결 성공(기본 생성자)");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 연결 해제(자원 반납)
	public void close() {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(psmt != null) psmt.close();
			if(con != null) con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			JDBCconnect1 jdbc = new JDBCconnect1();
			jdbc.stmt = jdbc.con.createStatement();
			jdbc.rs = jdbc.stmt.executeQuery("Select * from board");
			ResultSetMetaData rsmd = jdbc.rs.getMetaData();
			while (jdbc.rs.next()) {
				for (int i = 1; i < rsmd.getColumnCount(); i++) {
					System.out.print(String.format("%-10s",jdbc.rs.getObject(i)));
				}
				System.out.print(String.format("%s",jdbc.rs.getObject(6)));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		}
	}
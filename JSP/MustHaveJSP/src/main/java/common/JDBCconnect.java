package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCconnect {
	public String driver;
	public String url;
	public String id;
	public String pwd;
	public Connection con;
	public Statement stmt;
	public ResultSet rs;
	public PreparedStatement psmt;
	
	public JDBCconnect() {
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/musthave";
		id = "musthave";
		pwd = "11300315";
	}
	public JDBCconnect(String driver, String url, String id, String pwd){
		this.driver = driver;
		this.url = url;
		this.id = id;
		this.pwd = pwd;
	}
	
	public Connection getConnection() {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, id, pwd);
			return con;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public void closeConnection() {
		try {
			if(psmt != null) psmt.close();
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

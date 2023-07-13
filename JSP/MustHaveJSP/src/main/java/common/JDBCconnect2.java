package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.jsp.JspWriter;

public class JDBCconnect2 {
	private String driver;
	private String url;
	private String id;
	private String pwd;
	
	public JDBCconnect2(){};
	public JDBCconnect2(String driver, String url, String id, String pwd){
		this.driver = driver;
		this.url = url;
		this.id = id;
		this.pwd = pwd;
	}
	public Connection getConnection() throws Exception {
		Class.forName(driver);
		return DriverManager.getConnection(url, id, pwd);
	}

	public void writeMemberToTable(Connection con, JspWriter out, String text) {
		Statement st = null;
		ResultSet rs = null;

		try {
			out.write("<table border = '1'>");
			out.write("<tr>");
			out.write("<td>id</td><td>pass</><td>name</td><td>regidate</dt>");
			out.write("</tr>");

			st = con.createStatement();
			rs = st.executeQuery("select * from member");
			while (rs.next()) {
				out.write("<tr>");
				out.write("<td>");
				out.write(rs.getString("id"));
				out.write("</td>");
				out.write("<td>");
				out.write(rs.getString("pw"));
				out.write("</td>");
				out.write("<td>");
				out.write(rs.getString("name"));
				out.write("</td>");
				out.write("<td>");
				out.write(rs.getString("regidate"));
				out.write("</td>");
				out.write("</tr>");
			}
			out.write("</table>");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(text.equals("close")) {
				try {
					if (rs != null)
						rs.close();
					if (st != null)
						st.close();
					if (con != null)
						con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void writeBoardToTable(Connection con, JspWriter out, String text) {
		Statement st = null;
		ResultSet rs = null;

		try {
			out.write("<table border = '1'>");
			out.write("<tr>");
			out.write("<td>num</td><td>title</><td>content</td><td>id</dt><td>postdate</dt><td>visitcount</dt>");
			out.write("</tr>");

			st = con.createStatement();
			rs = st.executeQuery("select * from board");
			while (rs.next()) {
				out.write("<tr>");
				out.write("<td>");
				out.write(rs.getString("num"));
				out.write("</td>");
				out.write("<td>");
				out.write(rs.getString("title"));
				out.write("</td>");
				out.write("<td>");
				out.write(rs.getString("content"));
				out.write("</td>");
				out.write("<td>");
				out.write(rs.getString("id"));
				out.write("</td>");
				out.write("<td>");
				out.write(rs.getString("postdate"));
				out.write("</td>");
				out.write("<td>");
				out.write(rs.getString("visitcount"));
				out.write("</td>");
				out.write("</tr>");
			}
			out.write("</table>");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(text.equals("close")) {
				try {
					if (rs != null)
						rs.close();
					if (st != null)
						st.close();
					if (con != null)
						con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) throws Exception {
		JDBCconnect2 jdbc = new JDBCconnect2();
		Connection con = jdbc.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from board");
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			while (rs.next()) {
				for (int i = 1; i < rsmd.getColumnCount(); i++) {
					System.out.print(String.format("%-10s", rs.getObject(i)));
				}
				System.out.print(String.format("%s", rs.getObject(6)));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
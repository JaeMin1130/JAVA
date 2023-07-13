package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.jsp.JspWriter;

public class JDBCconnect3 {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/musthave";
	private static String id = "musthave";
	private static String pwd = "11300315";

	private static Connection getConnection() throws Exception {
		Class.forName(driver);
		return DriverManager.getConnection(url, id, pwd);
	}

	public static void writeMemberToTable(JspWriter out) {
		Statement st = null;
		ResultSet rs = null;
		Connection con = null;
		try {
			con = getConnection();
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

	public static void writeBoardToTable(JspWriter out) {
		Statement st = null;
		ResultSet rs = null;
		Connection con = null;
		try {
			con = getConnection();
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
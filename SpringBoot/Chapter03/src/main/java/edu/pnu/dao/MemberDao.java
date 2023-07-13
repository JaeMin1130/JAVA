package edu.pnu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.pnu.domain.Member;
import edu.pnu.domain.Member.MemberBuilder;

public class MemberDao {
	private String driver = "org.h2.Driver";
	private String url = "jdbc:h2:tcp://localhost/~/test";
	private String userID = "sa";
	private String password = "11300315";
	private Connection con;

	@SuppressWarnings("static-access")
	public MemberDao() {
		try {
			getClass().forName(driver);
			con = DriverManager.getConnection(url, userID, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Member> getMembers() throws SQLException {
		List<Member> list = new ArrayList<>();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from member");
		while (rs.next()) {
			Member m = Member.builder().id(rs.getLong("id")).name(rs.getString("name"))
					.nickname(rs.getString("nickname")).age(rs.getInt("age")).build();
			list.add(m);
		}
		rs.close();
		stmt.close();
		return list;
	}

	public Member getMember(Long id) throws SQLException {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from member where id = " + id);
		rs.next();
		Member m = Member.builder().id(rs.getLong("id")).name(rs.getString("name")).nickname(rs.getString("nickname"))
				.age(rs.getInt("age")).build();
		rs.close();
		stmt.close();
		return m;
	}

	public void insertMember(Member m) throws SQLException {
		String sql = "insert into member (name, nickname, age) values(?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, m.getName());
		ps.setString(2, m.getNickname());
		ps.setInt(3, m.getAge());
		ps.executeUpdate();
		ps.close();
	}
}

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="common.JDBCconnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h2>회원 추가 테스트(executeUpdate() 사용)</h2>
	<%
	JDBCconnect jdbc = new JDBCconnect();
	Connection con = jdbc.getConnection();
	if(con == null){
		out.print("<h2>Fail to connect DB</h2>");
	}
	
	String id = "test1";
	String pwd = "1111";
	String name = "회원1";
	
	String sql = "insert into member (id, pw, name) values(?, ?, ?)";
	PreparedStatement psmt = con.prepareStatement(sql);
	
	psmt.setString(1, id);
	psmt.setString(2, pwd);
	psmt.setString(3, name);
	
	int inResult = psmt.executeUpdate();
	out.println(inResult + "행이 입력되었습니다.");
	
	try {
		if (psmt != null)
			psmt.close();
		if (con != null)
			jdbc.closeConnection(con);
	} catch (Exception e) {
		e.printStackTrace();
	}
	%>
</body>
</html>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="common.JDBCconnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>JDBC</title>
</head>
<body>
	<h2>회원 목록 조회 테스트(executeQuery() 사용)</h2>
<%
	JDBCconnect jdbc = new JDBCconnect();
	Connection con = jdbc.getConnection();
	
	String sql = "select * from member";
	Statement stmt = con.createStatement();
	
	ResultSet rs = stmt.executeQuery(sql);
	
	while(rs.next()){
		String id = rs.getString(1);
		String pwd = rs.getString(2);
		String name = rs.getString(3);
		java.sql.Date regidate = rs.getDate(4);
		out.println(String.format("%s %s %s %s", id, pwd, name, regidate) + "<br/>");
	}
	
	try{
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(con != null) con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
%>

</body>
</html>
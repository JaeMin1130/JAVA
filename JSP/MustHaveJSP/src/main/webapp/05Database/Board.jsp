<%@page import="java.sql.Connection"%>
<%@ page import="common.JDBCconnect2" %>
<%@ page import="common.JDBCconnect3" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String driver = application.getInitParameter("mySQLDriver");
String url = application.getInitParameter("mySQLurl");
String id = application.getInitParameter("mySQLId");
String pwd = application.getInitParameter("mySQLPwd");

JDBCconnect2 jdbc = new JDBCconnect2(driver, url, id, pwd);
Connection con = jdbc.getConnection();
jdbc.writeMemberToTable(con, out, "notClose");

%>
<br>
<%
// jdbc.writeBoardToTable(con, out, "close");
%>
<br>
<%
JDBCconnect3.writeMemberToTable(out);
%>
<br>
<%
JDBCconnect3.writeBoardToTable(out);
%>
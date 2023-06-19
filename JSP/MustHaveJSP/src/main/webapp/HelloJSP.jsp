<!-- 지시어 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!-- 선언부 클래스, 메서드 정의-->
<%!String str1 = "JSP";
	String str2 = "안녕하세요.";%>
<!-- servlet으로 변활될 때, 자동으로 service 메서드 안에서 구현된다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<h2>
		처음 만들어보는<%=str1%> 
	</h2>
	<p>
		<%
		out.println(str2 + str1 + "입니다.");
		%>
	</p>
</body>
</html>
<!-- 화면에 찍는 게 없는 이런 파일을 servlet 파일로 만든다. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>내장객체 - response</title>
</head>
<body>
<%
String id = request.getParameter("user_id");
String pwd = request.getParameter("user_pwd");
if(id.equalsIgnoreCase("must") && pwd.equalsIgnoreCase("1234")){
	// 	통신량이 더 많다.
	response.sendRedirect("ResponseWelcome.jsp");
} else{
	request.getRequestDispatcher("ResponseMain.jsp?loginErr=1").forward(request, response);
}
%> 
</body>
</html>
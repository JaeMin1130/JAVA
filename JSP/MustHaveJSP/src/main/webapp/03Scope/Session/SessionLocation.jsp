<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>session 영역</title>
</head>
<body>
	<%
	// [lists, null]이 아니고 'lists'라는 key 자체가 없다는 뜻 
	if(session.getAttribute("lists") == null){
		out.print("<h1>SessionMain.jsp를 먼저 실행하세요</h1>");
	}else{
		ArrayList<String> lists = (ArrayList<String>)session.getAttribute("lists");
		out.print("<h2>페이지 이동 후 session 영역의 속성 읽기</h2>");
		for(String str:lists){
			out.print(str + "<br/>");
		}
	}
	%>
</body>
</html>
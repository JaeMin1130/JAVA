<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 날짜 표시 형식
SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

// 세션 생성 시각
long creationTime = session.getCreationTime();
String creationTimeStr = dateFormat.format(new Date(creationTime));

// 마지막 요청 시간
long lastTime = session.getLastAccessedTime();
String lastTimeStr = dateFormat.format(new Date(lastTime));
%>

<html>
<head>
<title>Session</title>
</head>
<body>
<h2>Session 설정 확인</h2>
<ul>
	<li>세션 유지 시간 : <%= session.getMaxInactiveInterval() %></li>
	<li>세션 아이디 : <%= session.getId() %></li>
	<li>최초 요청 시간 : <%= creationTimeStr %></li>
	<li>마지막 요청 시간 : <%= lastTimeStr %></li>
</ul>
</body>
</html>
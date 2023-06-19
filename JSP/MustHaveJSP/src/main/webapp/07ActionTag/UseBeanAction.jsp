<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>액션 태그 - UseBean</title>
</head>
<body>
	<h3>액션 태그로 폼값 한 번에 받기</h3>
	<jsp:useBean id="person" class="common.Person"/>
	<!-- property="*" 폼 태그의 value를 person의 필드값으로 지정 -->
	<jsp:setProperty property="*" name="person"/>
	
	<ul>
		<li>이름 : <jsp:getProperty name="person" property="name" /></li>
		<li>나이 : <jsp:getProperty name="person" property="age" /></li>
		<li>학교 : <%= request.getParameter("school") %></li>
	</ul>
</body>
</html>
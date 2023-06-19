<%@page import="el.MyELClass"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
MyELClass myClass = new MyELClass();
pageContext.setAttribute("myClass", myClass); // 객체는 반드시 영역에 저장하고 사용
%>
<html>
<head>
<title>표현 언어(EL) - 메서드 호출</title>
</head>
<body>
	<h3>영역에 저장 후 메서드 호출하기</h3>
	001225-3000000 => ${myClass.getGender("001225-3000000")}<br/>
	001225-2000000 => ${myClass.getGender("001225-2000000")}
	
	<h3>클래스명을 통해 정적 메서드 호출하기</h3>
	${MyELClass.showGugudan1(7)}<br/>
	${MyELClass.showGugudan2(7)}
</body>
</html>
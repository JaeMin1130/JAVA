<%@ page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// setAttribute : 페이지 내에서 사용 가능한 변수 설정
pageContext.setAttribute("pageInteger", 1000);
pageContext.setAttribute("pageString", "페이지 영역의 문자열");
pageContext.setAttribute("pagePerson", new Person("한석봉", 99));

int pInteger = (Integer) (pageContext.getAttribute("pageInteger"));
String pString = pageContext.getAttribute("pageString").toString();
Person pPerson = (Person) (pageContext.getAttribute("pagePerson"));
%>
<!DOCTYPE html>
<html>
<head>
<title>page 영역</title>
</head>
<body>
	<h2>page 영역의 속성값 읽기</h2>
	<ul>
		<li>Integer 객체 : <%= pInteger %></li>
		<li>String 객체 : <%= pString %></li>
		<li>Person 객체 : <%= pPerson %></li>
	</ul>

	<h2>include된 파일에서 page 영역 읽어오기</h2>
	<!-- 지시어 include, setAttribute()로 설정한 속성 사용 가능-->
	<%@ include file="PageInclude.jsp"%>

	<h2>페이지 이동 후 page 영역 읽어오기</h2>
	<!-- setAttribute()로 설정한 속성 사용 불가 -->
	<a href="PageLocation.jsp">PageLocation.jsp 바로가기</a>
</body>
</html>
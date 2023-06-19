<%@ page import="common.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setAttribute("requestString", "request 영역의 문자열");
request.setAttribute("requestPerson", new Person("안중근", 31));

request.setAttribute("forward", "0"); // request의 필드 선언
String forward = request.getParameter("forward"); // 지역 변수 선언
%>
<html>
<head>
<title>request 영역</title>
</head>
<body>
	<h2>request 영역의 속성값 삭제하기</h2>
	<%
		request.removeAttribute("requestString");
		request.removeAttribute("requestInteger"); // 에러 발생x
	%>
	<h2>request 영역의 속성값 읽기</h2>
	<%
	Person rPerson = (Person)(request.getAttribute("requestPerson"));
	%>
	<ul>
		<li>String 객체 : <%= request.getAttribute("requestString") %></li>
		<li>Person 객체 : <%= rPerson.getName() %>, <%= rPerson.getAge() %></li>
	</ul>
	<h2>포워드된 페이지에서 request 영역 속성값 읽기</h2>
	<%
	// forward가 1이면 forward 페이지로 넘어감
	// forward된 두 페이지는 하나의 request에 포함된다.
	if(forward != null && forward.equals("1")){
	RequestDispatcher rd = request.getRequestDispatcher("RequestForward.jsp?paramHan=한글&paramEng=English");
	rd.forward(request, response); 
	}
	%>
</body>
</html>
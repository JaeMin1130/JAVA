<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
String outerPath1 = "./inc/OuterPage1.jsp";
String outerPath2 = "./inc/OuterPage2.jsp";

pageContext.setAttribute("pAttr", "동명왕"); // page 영역
request.setAttribute("rAttr", "온조왕"); // request 영역
%>
<html>
<head>
<title>지시어와 액션 태그 동작 방식 비교</title>
</head>
<body>
	<h2>지시어와 액션 태그 동작 방식 비교</h2>
<h3>지시어로 페이지 포함하기</h3>
<%@ include file="./inc/OuterPage1.jsp"%>
<%-- <%@ include file="<%= outerPath1OuterPage1 %>" 지시어 안에 표현식이 들어갈 수 없다. --%>
<p>외부 파일에 선언한 변수 : <%= newVar1 %></p> <!-- OuterPage1의 코드를 그대로 가져와서 같이 컴파일되기 때문에 변수가 호출된다. -->

<h3>액션 태그로 페이지 포함하기</h3>
<jsp:include page="./inc/OuterPage2.jsp"/> <!-- 결과만 가져오기 때문에 page 영역을 공유하지 않는다. -->
<jsp:include page="<%= outerPath1 %>"/> <!-- 표현식이 들어갈 수 있다. -->
<p>외부 파일에 선언한 변수 : <%--= newVar2 --%></p>

</body>
</html>
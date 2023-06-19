<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%!public int add(int num1, int num2) {
		return num1 + num2;}
%>

<!-- 메서드 안에 들어가는 부분 -->
<%
String snum1 = request.getParameter("num1");
String snum2 = request.getParameter("num2");
int num1 = 0;
int num2 = 0;
if (snum1 != null && snum2 != null) {
	num1 = Integer.parseInt(snum1);
	num2 = Integer.parseInt(snum2);
}
int result = add(num1, num2);
%>
<!DOCTYPE html>
<html>
<head>
<title>스크립트 요소</title>
</head>
<body>
	덧셈 결과 1 : <%=result%><br /> 
	덧셈 결과 2 : <%=add(10, 40)%>
</body>
</html>
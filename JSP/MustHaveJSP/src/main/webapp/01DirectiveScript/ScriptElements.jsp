<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%!
public int add(int num1, int num2){
	return num1 + num2;
}
%>
<!DOCTYPE html>
<html>
<head><title>스크립트 요소</title></head>
<body>
<%
int result = add(10, 20);
%>
덧셈 결과 1 : <%= result %><br/>
덧셈 결과 2 : <%= add(10, 40) %>
</body>
</html>
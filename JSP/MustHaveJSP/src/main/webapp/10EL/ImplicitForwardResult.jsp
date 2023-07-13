<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>표현 언어(EL) - 내장 객체</title>
</head>
<body>
	<h2>ImplicitForwardResult 페이지 읽기</h2>
	<h3>각 영역에 저장된 속성 읽기</h3>
	<ul>
		<li>페이지 영역 : ${pageScope.scopeValue}</li> <!-- 없으면 null이 아니고 공백으로 나온다. -->
		<li>리퀘스트 영역 : ${requestScope.scopeValue}</li>
		<li>세션 영역 : ${sessionScope.scopeValue}</li>
		<li>애플리케이션 영역 : ${applicationScope.scopeValue}</li>
	</ul>
	
	<h3>영역 지정 없이 속성 읽기</h3>
	<ul>
		<li>${scopeValue}</li> <!-- forward하면 request 영역부터 공유한다. -->
	</ul>
</body>
</html>
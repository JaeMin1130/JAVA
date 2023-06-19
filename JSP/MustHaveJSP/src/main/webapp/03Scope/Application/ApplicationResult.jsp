<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Set"%>
<%@ page import="java.util.Map"%>
<%@ page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>application 영역</title>
</head>
<body>
	<%
	Map<String, Object> maps = (Map<String, Object>) application.getAttribute("maps");
	if (maps == null) {
		out.print("<h1>Don't restart your server.</h1>");
	} else {
		Set<String> keys = maps.keySet();
		out.print("<h2>application 영역의 속성 읽기</h2>");
		out.print("<h3>서버가 재실행되지 않는 한 공유된다.</h3>");
		for (String key : keys) {
			Object object = maps.get(key);
			if (object instanceof Person) {
				Person person = (Person) object;
				out.print(String.format("Key : %s, 이름 : %s, 나이 : %d<br/>", key, person.getName(), person.getAge()));
			}else if(object instanceof ArrayList){
				ArrayList<String> list = (ArrayList<String>)object;
				out.print(String.format("Key : %s, Value : %s<br/>", key, object.toString()));
			}
			else {
				out.print(String.format("Key : %s, Value : %s<br/>", key, object));
			}
		}
	}
	%>
</body>
</html>
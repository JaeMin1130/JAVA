<%@ page import="java.util.HashMap" %>
<%@ page import="common.Person" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>application 영역</title>
</head>
<body>
<h2>application 영역의 공유</h2>
<%
ArrayList<String> lists = new ArrayList<String>();
lists.add("리스트");
lists.add("컬렉션");

// Map은 순서를 보장하지 않는다.
Map<String, Object> maps = new HashMap<>();
// page
maps.put("page_Integer", 1000);
maps.put("page_String", "Iru");
// request
maps.put("request_String", "request 영역의 문자열");
maps.put("request_Person", new Person("안중근", 31));
// session
maps.put("session_lists", lists);
// application
maps.put("application_actor1", new Person("이수일", 30));
maps.put("application_actor2", new Person("심순애", 28));

application.setAttribute("maps", maps);
%>
application 영역에 속성이 저장되었습니다.
</body>
</html>
<%@ page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// Integer pInteger2 = (Integer)(pageContext.getAttribute("pageInteger"));
// String pString2 = pageContext.getAttribute("pagetring").toString();
Person pPerson2 = (Person) (pageContext.getAttribute("pagePerson"));
%>
	
<h4>Include 페이지</h4>
<ul>
	<!-- 저장한 객체가 문자열이거나 기본 타입의 Wrapper 클래스라면 별도의 형변환 없이 출력할 수 있다. -->
	<li>Integer 객체 : <%= pageContext.getAttribute("pageInteger") %></li>
	<li>String 객체 : <%= pageContext.getAttribute("pageString") %></li>
	<li>Person 객체 : <%= pPerson2.toString() %></li>
</ul>

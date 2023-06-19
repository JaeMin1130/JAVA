<%@page import="java.sql.Connection"%>
<%@page import="membership.MemberDTO"%>
<%@page import="membership.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%     
String userId = request.getParameter("user_id");
String userPwd = request.getParameter("user_pwd");

MemberDAO dao = new MemberDAO();
Connection con = dao.getConnection();
MemberDTO dto = dao.getMemberDTO(userId, userPwd);
dao.closeConnection(con);
  
if(dto.getId() != null){
	session.setAttribute("UserId", dto.getId());
	session.setAttribute("UserName", dto.getName());
	response.sendRedirect("../08Board/List.jsp");
}
else{
	request.setAttribute("LoginErrMsg", "로그인 오류입니다.");
	request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
}
%>


package servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import membership.MemberDAO;
import membership.MemberDTO;

@WebServlet(urlPatterns = "/13Servlet/MemberAuth.mvc",
			initParams = {@WebInitParam(name="admin_id", value="nakja")})
public class MemberAuth extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	MemberDAO dao;
	
	public void init() throws ServletException{
		ServletContext application = this.getServletContext();
		
		String driver = application.getInitParameter("mySQLDriver");
		String connectUrl = application.getInitParameter("mySQLUrl");
		String id = application.getInitParameter("mySQLId");
		String pwd = application.getInitParameter("mySQLPwd");
		
		dao = new MemberDAO(driver, connectUrl, id, pwd);
	}
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String admin_id = this.getInitParameter("admin_id");
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pass");
		
		MemberDTO dto = dao.getMemberDTO(id, pwd);
		System.out.println("12412645986");
		String memberName = dto.getName();
		if(memberName != null) {
			req.setAttribute("authMessage", memberName + "회원님 방가방가^^");
		}
		else {
			if(admin_id.equals(id)) {
				req.setAttribute("authMessage", admin_id + "님은 최고 관리자입니다.");
			}
			else {
				req.setAttribute("authMessage", "귀하는 회원이 아닙니다.");
			}
		}
		req.getRequestDispatcher("/13Servlet/MemberAuth.jsp").forward(req, resp);
//		req.getRequestDispatcher("/WEB-INF/view.MemberAuthView.jsp").forward(req, resp);
	}
}

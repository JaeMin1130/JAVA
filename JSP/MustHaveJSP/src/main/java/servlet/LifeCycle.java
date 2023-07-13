package servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/13Servlet/LifeCycle.do")
public class LifeCycle extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void myPostConstruct() {
		System.out.println("myPostConstruct() 호출");
	}
	
	public void init() throws ServletException{
		System.out.println("init() 호출");
	}
	// 보통 service, get, post 셋 중 하나만 사용한다.
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("service() 호출");
		super.service(req, resp);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("doGet() 호출");
//		req.getRequestDispatcher("/13Servlet/LifeCycle.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("doPost() 호출");
//		req.getRequestDispatcher("/13Servlet/LifeCycle.jsp").forward(req, resp);
	}
	
	public void destroy() {
		System.out.println("destroy() 호출");
	}
	
	public void myPreDestroy() {
		System.out.println("myPreDestroy() 호출");
	}
}

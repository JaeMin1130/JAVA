package edu.pnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/home")
	public String home() {
		// "/WEB-INF/board/home.jsp" 리턴
		return "home";
	}

	@GetMapping("/home1")
	public void home1() {
		// 리턴이 없으면 자동으로 GetMapping 한 url이 붙는다. "/WEB-INF/board/home1.jsp"
	}
	
	@GetMapping("/model")
	public String model(Model model) {
		model.addAttribute("data", "홍길동"); 
		return "model";
	}
	
}

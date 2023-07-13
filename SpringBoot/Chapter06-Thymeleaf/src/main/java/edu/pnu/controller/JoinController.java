package edu.pnu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.pnu.domain.Member;
import edu.pnu.service.MemberService;

@Controller
public class JoinController {

	@Autowired
	private MemberService memberService;

	@GetMapping("/join")
	public void joinView() {
	}

	@PostMapping("/join")
	public String join(Member member, Model model) {
		if(memberService.insertMember(member)) {			
			return "redirect:login";
		}else {
			return "redirect:joinError";
		}
	}

}

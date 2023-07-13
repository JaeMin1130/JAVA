package edu.pnu.config;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	@GetMapping("/")
	public String index() {
		return "Index";
	}
	
	@GetMapping("/member")
	public String member() {
		return "Member";
	}
	
	@GetMapping("/manager")
	public String manager() {
		return "Manager";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Admin";
	}
	
	@GetMapping("/auth")
	public String auth(@AuthenticationPrincipal User user) {
		return user.toString();
	}
}

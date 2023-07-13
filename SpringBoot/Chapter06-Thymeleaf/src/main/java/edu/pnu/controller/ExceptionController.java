package edu.pnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import edu.pnu.exception.BoardNotFoundException;
import edu.pnu.exception.JoinException;
import edu.pnu.exception.UsernameNotFoundException;

@Controller
public class ExceptionController {
	
	@GetMapping("/boardError")
	public String boardError() {
		throw new BoardNotFoundException("검색된 게시글이 없습니다.");
	}
	@GetMapping("/illegalArgumentError")
	public String illegalArgumentError() {
		throw new BoardNotFoundException("부적절한 인자가 전달되었습니다.");
	}
	@GetMapping("/sqlError")
	public String sqlError() {
		throw new BoardNotFoundException("SQL 구문에 오류가 있습니다.");
	}
	@GetMapping("/usernameError")
	public String usernameError() {
		throw new UsernameNotFoundException("Id를 찾을 수 없습니다.");
	}
	@GetMapping("/joinError")
	public String joinError() {
		throw new JoinException("Id 중복입니다.");
	}
	
	
}

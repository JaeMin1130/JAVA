package edu.pnu.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pnu.dao.MemberDao;
import edu.pnu.domain.Member;
import lombok.extern.slf4j.Slf4j;

@Slf4j // 롬복이 제공하는 logging 엔진
@RestController
public class HomeController {
	MemberDao memberDao;

	public HomeController() {
		System.out.println("HomeController가 생성되었습니다.");
		log.error("HomeController(error)가 생성되었습니다.");
		log.warn("HomeController(warn)가 생성되었습니다.");
		log.info("HomeController(info)가 생성되었습니다.");
		log.debug("HomeController(debug)가 생성되었습니다."); // 콘솔에 안 찍힘 -> 프로퍼티 수정
		log.trace("HomeController(trace)가 생성되었습니다."); // 콘솔에 안 찍힘 -> 프로퍼티 수정
		memberDao = new MemberDao();
	}

	@GetMapping("/hello")
	public String hello(String name) {
		return "Hello : " + name;
	}

	@GetMapping("/member")
	public Member getMember(Long id) throws SQLException {
		return memberDao.getMember(id);
	}

	@GetMapping("/members")
	public List<Member> getMembers() throws SQLException {
		return memberDao.getMembers();
	}

	@PostMapping("/member")
	public void insertMember(Member m) throws SQLException {
		memberDao.insertMember(m);
	}
}

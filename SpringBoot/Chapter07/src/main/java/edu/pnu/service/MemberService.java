package edu.pnu.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import edu.pnu.domain.Member;
import edu.pnu.persistence.MemberRepository;

@Service
public class MemberService {

	@Autowired
	MemberRepository memberRepo;

	@Autowired
	BCryptPasswordEncoder encoder;

	public boolean save(Member member) {
		Optional<Member> option = memberRepo.findById(member.getUsername());
		if (option.isPresent()) {
			return false;
		} else {
			member.setRole("ROLE_MEMBER");
			member.setEnabled(true);
			member.setPassword(encoder.encode(member.getPassword()));
			memberRepo.save(member);
			return true;
		}
	}
}
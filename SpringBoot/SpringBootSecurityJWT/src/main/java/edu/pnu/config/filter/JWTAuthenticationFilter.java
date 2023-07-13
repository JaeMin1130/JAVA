package edu.pnu.config.filter;

import java.io.IOException;
import java.util.Date;
import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.pnu.domain.Member;
import edu.pnu.persistence.MemberRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
// Authentication : 로그인(인증)
// 사용자 정의 필터
public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	private final AuthenticationManager authenticationManager;
	private final MemberRepository memberRepo;

	@Override
	public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse resp)
			throws AuthenticationException {

		ObjectMapper om = new ObjectMapper();
		try {
			Member member = om.readValue(req.getInputStream(), Member.class);
			Optional<Member> opt = memberRepo.findById(member.getUsername());
			if (!opt.isPresent()) {
				log.info("Not Authenticated : User Not Found");
				return null;
			}
			// loadUserByUsername 할 준비
			Authentication authToken = new UsernamePasswordAuthenticationToken(member.getUsername(),
					member.getPassword());
			// loadUserByUsername 호출(인증 실행)
			Authentication auth = authenticationManager.authenticate(authToken);
			log.info("attemptAuthentication : [" + member + "]");
			return auth;
		} catch (Exception e) {
			log.info("Not Authenticated " + e.getMessage());
		}
		return null;
	}
	
	@Override 
	// UsernamePasswordAuthenticationFilter < AbstractAuthenticationProcessingFilter의 메서드(unsuccessfulAuthentication도 있다.)
	// Subclasses can override this method to continue the {@link FilterChain} after successful authentication.
	public void successfulAuthentication(HttpServletRequest req, HttpServletResponse resp, FilterChain chain,
			Authentication auth) throws IOException, ServletException {
		
		// authenticate()가 성공해야 메서드가 실행돼서 항상 null이 아님
		User user = (User) auth.getPrincipal();
		
		// JWT 생성
		String jwtToken = JWT.create().withClaim("username", user.getUsername()) // 토큰화 대상
				.withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 10)) // 토큰 유효기간 10분
				.sign(Algorithm.HMAC256("edu.pnu.jwtkey")); // 복호화 키 : "edu.pnu.jwtkey"

		// 응답 Header에 "Authorization"이라는 키로 JWT 토큰 추가
		// Bearer : JWT임을 나타내는 용어, Basic : "Basic " + Base64(username:password)
		resp.addHeader("Authorization", "Bearer " + jwtToken);
		chain.doFilter(req, resp);
	}
}

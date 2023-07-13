package edu.pnu.config.auth;

import java.io.IOException;
import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import edu.pnu.domain.Member;
import edu.pnu.persistence.MemberRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Authorize : 권한(인가)
public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

	private MemberRepository memberRepo;

	public JWTAuthorizationFilter(AuthenticationManager authenticationManager, MemberRepository memberRepo) {
		super(authenticationManager);
		this.memberRepo = memberRepo;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		// 요청 헤더에서 키가 "Authorization"인 값 받아오기
		String srcToken = req.getHeader("Authorization");
		
		if (srcToken == null || !srcToken.startsWith("Bearer ")) {
			chain.doFilter(req, resp); // doFilter : chain 내에 있는 다음 필터를 호출
			return;
		}

		String jwtToken = srcToken.replace("Bearer ", "");
		// 복호화키("edu.pnu.jwtkey")로 복호화 -> username
		String username = JWT.require(Algorithm.HMAC256("edu.pnu.jwtkey")).build().verify(jwtToken).getClaim("username")
				.asString();

		Optional<Member> opt = memberRepo.findById(username);
		if (!opt.isPresent()) {
			chain.doFilter(req, resp);
			return;
		}

		Member member = opt.get();
		User user = new User(member.getUsername(), member.getPassword(), member.getAuthorities());
		Authentication auth = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
		
		// Session > SecurityContext > Authentication에 auth(user) 저장 
		SecurityContextHolder.getContext().setAuthentication(auth);
		
		chain.doFilter(req, resp);
	}
}

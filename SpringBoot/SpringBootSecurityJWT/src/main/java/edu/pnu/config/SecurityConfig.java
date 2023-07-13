package edu.pnu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import edu.pnu.config.auth.JWTAuthorizationFilter;
import edu.pnu.config.filter.JWTAuthenticationFilter;
import edu.pnu.persistence.MemberRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private AuthenticationConfiguration authConfig;
	
	@Autowired
	private MemberRepository memberRepo;
	

//	@Bean
//	PasswordEncoder createDelegatingPasswordEncoder() {
//		return PasswordEncoderFactories.createDelegatingPasswordEncoder(); // 얘도 bcrypt 방식이다.
//	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
    	// CSRF 보호 비활성화(JS에서 호출 가능)
    	http.csrf(csrf -> csrf.disable());
    	// CORS 보호 비활성화(React에서 호출 가능), 
    	http.cors(cors -> cors.disable());
    	
    	http.authorizeHttpRequests(security -> {
    		security.requestMatchers("/member/**").authenticated()
    				.requestMatchers("/manager/**").hasAnyRole("MANAGER", "ADMIN")
    				.requestMatchers("/admin/**").hasRole("ADMIN")
    				.anyRequest().permitAll();
    	});
    	
    	http.formLogin(form -> form.disable());
    	// 시큐리티 세션을 만들지 않겠다고 설정 : 첫 로그인시 로그인 정보를 저장하지 않고 대신 JWT 토큰을 넘겨준다. -> 다음 요청부터 header가 토큰을 포함하고 있다.
    	http.sessionManagement(ssmg -> ssmg.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    	
    	// filterChain에 필터 추가 
    	// AuthenticationConfiguration > AuthenticationManager
    	http.addFilter(new JWTAuthenticationFilter(authConfig.getAuthenticationManager(), memberRepo));
		http.addFilter(new JWTAuthorizationFilter(authConfig.getAuthenticationManager(), memberRepo));

    	
		return http.build();
	}
}

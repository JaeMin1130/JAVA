package edu.pnu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Autowired
	BoardUserDetailsService boardUserDetailsService;
	
	@Bean
	BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(auth -> {
				// /member와 하위 주소는 로그인한 사용자면 모두 접근 가능
			auth.requestMatchers("/member/**").authenticated() 
				// /manager와 하위 주소는 ROLE_MANAGER, ROLE_ADMIN 권한을 가진 사용자만 접근 가능
				.requestMatchers("/manager/**").hasAnyRole("MANAGER", "ADMIN")
				// /admin과 하위 주소는 ROLE_ADMIN 권한을 가진 사용자만 접근 가능
				.requestMatchers("/admin/**").hasRole("ADMIN")
				// 위에서 설정한 주소 외 모든 주소는 누구든 접근 허용
				.anyRequest().permitAll();
		});
		
		// CSRF 보호 비활성화(JS에서 호출 가능) 
		http.csrf(csrf -> csrf.disable());
		// CORS 보호 비활성화(React에서 호출 가능) : RestAPI로 호출할 때
		http.cors(cors -> cors.disable());
		
		// <form> 태그 기반의 로그인 지원하도록 설정
		// <form> 태그에 action 설정 안 해도 됨
		http.formLogin(form -> {
			form.loginPage("/login")
				.defaultSuccessUrl("/loginSuccess", true);
			});
		
		http.exceptionHandling(ex -> ex.accessDeniedPage("/accessDenied"));
		
		http.logout(logout ->{
			logout.invalidateHttpSession(true)
				.deleteCookies("JSESSIONID")
				.logoutSuccessUrl("/login");
		});	
		
		return http.build();
	}
}

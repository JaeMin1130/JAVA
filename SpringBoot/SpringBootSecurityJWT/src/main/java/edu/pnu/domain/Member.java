package edu.pnu.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Member {
	@Id
	private String username;
	private String password;
	private String role;
	private boolean enabled;
	
	public Collection<? extends GrantedAuthority> getAuthorities(){
		return AuthorityUtils.createAuthorityList(role);
	}
	
}

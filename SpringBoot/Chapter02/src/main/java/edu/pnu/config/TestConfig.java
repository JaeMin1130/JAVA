package edu.pnu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 붙어 있는 클래스의 인스턴스를 생성한다.
public class TestConfig {
	public TestConfig() {
		System.out.println("=".repeat(50));
		System.out.println("TestConfig 생성");
		System.out.println("=".repeat(50));
	}
	@Bean // 붙어 있는 메소드가 리턴하는 인스턴스를 생성한다.
	public TestBean testBean() {
		return new TestBean();
	}
}

class TestBean{
	public TestBean() {
		System.out.println("=".repeat(50));
		System.out.println("TestBean 생성");
		System.out.println("=".repeat(50));
	}
}

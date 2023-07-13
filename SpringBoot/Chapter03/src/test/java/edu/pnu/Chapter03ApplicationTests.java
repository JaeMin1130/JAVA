package edu.pnu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

//@SpringBootTest
//@AutoConfigureMockMvc
@WebMvcTest
class Chapter03ApplicationTests {
	
	@Autowired // 자동으로 만들어진 MockMvc 인스턴스와 참조변수 mockMvc를 연결해 준다.
	MockMvc mockMvc;
	
	@Test
	void contextLoads() {
	}

}

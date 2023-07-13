package edu.pnu;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

import edu.pnu.dao.MemberDao;
import edu.pnu.domain.Member;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class MemberDaoTest {
	// @Test가 여러 개 있을 때, 실행 순서를 보장하지 않는다.
	@Test
	@Order(1)
	public void insertMemberTest() throws SQLException {
		MemberDao memberDao = new MemberDao();
		for (int i = 0; i < 10; i++) {
			
			// @Builder를 활용한 방법
			memberDao.insertMember(Member.builder()
										.name("name" + i)
										.nickname("nick" + i)
										.age(20 + i)
										.build());
										
			// @NoArgsConstructor를 활용한 방법							
//			Member m = new Member();
//			m.setName("name" + i);
//			m.setNickname("nickname" + i);
//			m.setAge(20 + i);
//			memberDao.insertMember(m);
			
			// @AllArgsConstructor를 활용한 방법
//			memberDao.insertMember(new Member(-1L, "name" + i, "nickname" + i, 20+i ));
		}
	}
	
	@Test
	@Order(2)
	public void selectAllMemberTest() throws SQLException {
		MemberDao memberDao = new MemberDao();
		List<Member> list =  memberDao.getMembers();
		for(Member m : list) {
			System.out.println(m);
		}
	}
}

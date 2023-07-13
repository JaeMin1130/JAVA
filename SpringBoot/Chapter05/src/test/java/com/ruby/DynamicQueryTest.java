package com.ruby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.querydsl.core.BooleanBuilder;
import com.ruby.domain.Board;
import com.ruby.domain.QBoard;
import com.ruby.persistence.DynamicBoardRepository;

@SpringBootTest
public class DynamicQueryTest {
	@Autowired
	DynamicBoardRepository dbr;

	private void test(String searchCondition, String searchKeyword) {
		
		BooleanBuilder builder = new BooleanBuilder();
		QBoard qboard = QBoard.board;
		
		if(searchCondition.equals("TITLE")) {
			// select b from Board b where b.title like '%'||:searchKeyword||'%'
			builder.and(qboard.title.like("%" + searchKeyword + "%"));
		} else if(searchCondition.equals("CONTENT")) {
			// select b from Board b where b.content like '%'||:searchKeyword||'%'
			builder.and(qboard.content.like("%" + searchKeyword + "%"));
		}
		
		Iterable<Board> list = dbr.findAll(builder);
		for(Board b : list) {
			System.out.println(b);
		}
	}
	private void test1(Map<String, String> map) {
		BooleanBuilder builder = new BooleanBuilder();
		QBoard qboard = QBoard.board;
		Object[] keys = map.keySet().toArray();
		Arrays.sort(keys);
		
		builder.and(qboard.content.like("%" + map.get(String.valueOf(keys[0])) + "%"))
				.and(qboard.title.like("%" + map.get(String.valueOf(keys[1])) + "%"));
		
		System.out.println(map.get(String.valueOf(keys[1])));
		Iterable<Board> list = dbr.findAll(builder);
		for(Board b : list) {
			System.out.println(b);
		}
	}
	

	@Test
	public void testDynamicQuery() {
//		test("TITLE", "2");
//		test("CONTENT", "Content2");

		Map<String, String> map = new HashMap<>();
		map.put("TITLE", "5");
		map.put("CONTENT", "5");
		test1(map);
	}
}

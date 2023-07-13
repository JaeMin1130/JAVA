package com.ruby;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.querydsl.core.BooleanBuilder;
import com.ruby.domain.QBoard;
import com.ruby.persistence.DynamicBoardRepository;

@SpringBootTest
public class DynamicQueryTest2 {
	@Autowired 
	DynamicBoardRepository dbr;
	
	private void test(String condition, String keyword) {
		QBoard qboard = QBoard.board;
		BooleanBuilder builder = new BooleanBuilder();
		
		if(condition.equals("TITLE")) {
			builder.and(qboard.title.like('%' + keyword + '%'));
		}else if(condition.equals("CNT")) {
			builder.and(qboard.cnt.like('%' + keyword + '%'));
		}
	}
	
	@Test
	public void testDynamicQuery() {
		
	}
}

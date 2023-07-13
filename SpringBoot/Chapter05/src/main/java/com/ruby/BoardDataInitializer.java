package com.ruby;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ruby.domain.Board;
import com.ruby.persistence.BoardRepository;

// 최초 한 번 실행
//@Component
public class BoardDataInitializer implements ApplicationRunner {
	@Autowired
	BoardRepository boardRepo;
	Random rd = new Random();

	@Override
	public void run(ApplicationArguments args) throws Exception {
		for (int i = 0; i < 100; i++) {

			Board board = new Board();
			board.setTitle("Title" + String.valueOf(rd.nextLong(101)));
			board.setWriter("테스터");
			board.setContent("Content" + String.valueOf(rd.nextLong(101)));
			board.setCreateDate(new Date());
			board.setCnt(rd.nextLong(101));

			boardRepo.save(board);
		}

	}

}

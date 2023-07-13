package edu.pnu;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import edu.pnu.domain.Board;
import edu.pnu.persistence.BoardRepository;

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
			board.setCnt(0L);

			boardRepo.save(board);
		}

	}

}

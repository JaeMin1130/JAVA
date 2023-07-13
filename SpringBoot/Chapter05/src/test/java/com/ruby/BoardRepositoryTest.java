package com.ruby;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ruby.domain.Board;
import com.ruby.persistence.BoardRepository;

@SpringBootTest
public class BoardRepositoryTest {
	@Autowired
	private BoardRepository boardRepo;

	// 등록 기능 테스트
//	@Test
	public void testInsertBoard() {
		Board board = new Board();
		board.setTitle("두 번째 게시글");
		board.setWriter("테스터");
		board.setContent("잘 등록되나요?");
		board.setCreateDate(new Date());
		board.setCnt(0L);

		boardRepo.save(board);
	}

	// 단일 목록 조회 기능 테스트
//	@Test
	public void testGetBoard() {
		Board board = boardRepo.findById(1L).get();
		System.out.println(board.toString());
	}

	// 전체 목록 조회 기능 테스트
//	@Test
	public void testfindAll() {
		List<Board> list = boardRepo.findAll();
		System.out.println(list.toString());
	}

	// 수정 기능 테스트
//	@Test
	public void testUpdateBoard() {
		System.out.println("=== 1번 게시글 조회 ===");
		Board board = boardRepo.findById(1L).get();
		System.out.println(board);

		System.out.println("=== 1번 게시글 제목 수정 ===");
		board.setTitle("제목을 수정했습니다.");
		boardRepo.save(board);
		System.out.println(board);
	}

	// 삭제 기능 테스트
//	@Test
	public void testDeleteBoard() {
		boardRepo.deleteById(1L);
	}

//	@Test
	public void testQueryAnnotationTest2() {
		List<Board> list = boardRepo.queryAnnotationTest2("9");
		System.out.println(list.toString());
	}

	@Test
	public void testQueryAnnotationTest3() {
		List<Object[]> list = boardRepo.queryAnnotationTest3("9");
		for (Object[] i : list) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	@Test
	public void testQueryAnnotationTest5() {
		Pageable paging = PageRequest.of(0, 3, Sort.Direction.DESC, "cnt");
		List<Board> list = boardRepo.queryAnnotationTest5(paging);
		for(Board b : list) {
			System.out.println(b);
		}
	}
}
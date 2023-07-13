package com.ruby.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ruby.domain.Board;
import com.ruby.persistence.BoardRepository;

@RestController
public class BoardController {

	@Autowired
	BoardRepository boardRepo;

	@GetMapping("/board/{id}")
	public Board getBoard(@PathVariable Long id) {
		return boardRepo.findById(id).get();
	}

	@GetMapping("/boards")
	public List<Board> getBoardList() {
		return boardRepo.findAll();
	}

	@PostMapping("/board")
	public Board insertBoard(Board board) {
		if (board.getCreateDate() == null) {
			board.setCreateDate(new Date());
		}
		boardRepo.save(board);
		return boardRepo.save(board);
	}

	// json 타입으로 데이터 받기 => @RequestBody
	@PostMapping("/boardjson")
	public Board insertJsonBoard(@RequestBody Board board) {
		if (board.getCreateDate() == null) {
			board.setCreateDate(new Date());
		}
		return boardRepo.save(board);
	}

	@DeleteMapping("/board/{id}")
	public String deleteBoard(@PathVariable Long id) {
		try {
			boardRepo.deleteById(id);
			return "Success";
		} catch (Exception e) {
			return "Fail";
		}
	}

	@PutMapping("/board")
	public String updateBoard(Board board) {
		if (board.getSeq() != null) {
			board.setCreateDate(new Date());
			boardRepo.save(board);
			return "Success";
		} else {
			return "Fail(add an info of seq)";
		}
	}

	@GetMapping("/findBoard1")
	public List<Board> findBoard1(String keyword) {
		return boardRepo.findByTitleContaining(keyword);
	}

	@GetMapping("/findBoard2")
	public List<Board> findBoard2(String keyword) {
		return boardRepo.findByTitleContainingAndCntGreaterThan(keyword, 50L);
	}

	@GetMapping("/findBoard3")
	public List<Board> findBoard3() {
		return boardRepo.findByCntBetweenOrderByCntAsc(10L, 50L);
	}

	@GetMapping("/findBoard4")
	public List<Board> findBoard4(String keyword1, String keyword2) {
		return boardRepo.findByTitleContainingOrContentContainingOrderBySeqDesc(keyword1, keyword2);
	}

	@GetMapping("/findBoard5")
	public Page<Board> findBoard5(int pageNum, int size) {
		Pageable page = PageRequest.of(pageNum, size); // 5개씩 끊었을 때 두 번째 페이지
		return boardRepo.findAll(page);
	}
}
package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;
// @Controller - @ResponseBody, @RequestBody
// @RestController - 반환값에 자동으로 @ResponseBody가 붙는다. 
//@Controller
@RestController
public class BoardController {
	public BoardController() {
		System.out.println("=".repeat(50));
		System.out.println("BoardController 생성");
		System.out.println("=".repeat(50));
	}
	
	@GetMapping("/hello")
	public @ResponseBody String hello1(@RequestBody String name) {
		return "(get)Hello, " + name;
	}
	@PostMapping("/hello")
	public String hello2(String name) {
		return "(post)Hello, " + name;
	}
	@PutMapping("/hello")
	public String hello3(String name) {
		return "(put)Hello, " + name;
	}
	@DeleteMapping("/hello")
	public String hello4(String name) {
		return "(delete)Hello, " + name;
	}
	
	// 객체를 리턴하면 JSON 타입으로 넘어간다.
	@GetMapping("/getBoard1")
	public BoardVO getBoard1() {
		BoardVO board = new BoardVO();
		board.setSeq(1);
		board.setTitle("테스트 제목");
		board.setWriter("테스트");
		board.setContent("테스트 내용");
		board.setCnt(0);
		return board;
	}
	
	@GetMapping("/getBoard2")
	public BoardVO getBoard2() {
		BoardVO board = new BoardVO(1, "테스트 제목", "테스트", "테스트 내용", 0);
		return board;
	}
	
	@GetMapping("/getBoard3")
	public BoardVO getBoard3() {
		return BoardVO.builder()
				.seq(1)
				.title("테스트 제목")
				.writer("테스트")
				.content("테스트 내용")
				.cnt(0)
				.build();
	}
	
	@GetMapping("/getBoardList")
	public List<BoardVO> getBoardList(){
		List<BoardVO> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new BoardVO(i, "테스트 제목", "테스트", "테스트 내용", 0));
		}
		return list; 
	}
	// BoardVO의 멤버변수를 url에 넣어주면 json 형태로 리턴한다.
	@GetMapping("/board")
	// @RequestBody : url이 아닌 json 형태로 보낼 때 사용
	public @ResponseBody BoardVO board(@RequestBody BoardVO b) {
		System.out.println("Board : " + b);
		return b;
	}
	
}
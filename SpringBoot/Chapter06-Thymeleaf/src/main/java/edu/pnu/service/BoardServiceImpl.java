package edu.pnu.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import edu.pnu.domain.Board;
import edu.pnu.domain.Member;
import edu.pnu.persistence.BoardRepository;
import edu.pnu.persistence.MemberRepository;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardRepository boardRepo;
	
	@ModelAttribute("member")
	public Member setMember() {
		return new Member();
	}
	@Override
	public Iterable<Board> getBoardList() {
		
		Iterable<Board> boardList = boardRepo.findAll();		
		return boardList;
	}
	
	@Override
	public Board getBoard(Board board) {
		Board curBoard = boardRepo.findById(board.getSeq()).get();
		curBoard.setCnt(curBoard.getCnt() + 1);
		boardRepo.save(curBoard);
		return boardRepo.findById(curBoard.getSeq()).get();
	}
	
	@Override
	public void insertBoard(Board board) {
		board.setCreateDate(new Date());
		board.setCnt(0L);
		boardRepo.save(board);
	}
	
	@Override
	public void updateBoard(Board board) {
		Board findBoard = boardRepo.findById(board.getSeq()).get();
		findBoard.setTitle(board.getTitle());
		findBoard.setContent(board.getContent());
		boardRepo.save(findBoard);
	}
	
	@Override
	public void deleteBoard(Board board) {
		boardRepo.deleteById(board.getSeq());
	}
}
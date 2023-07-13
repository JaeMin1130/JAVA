package edu.pnu.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pnu.domain.Board;
import edu.pnu.persistence.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardRepository boardRepo;
	
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
package edu.pnu.service;

import edu.pnu.domain.Board;
import edu.pnu.domain.Member;

public interface BoardService {

	Iterable<Board> getBoardList();

	Board getBoard(Board board);

	void insertBoard(Board board);

	void updateBoard(Board board);

	void deleteBoard(Board board);

}
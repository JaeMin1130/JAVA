package edu.pnu.service;

import edu.pnu.domain.Board;

public interface BoardService {

	Iterable<Board> getBoardList();

	Board getBoard(Board board);

	void insertBoard(Board board);

	void updateBoard(Board board);

	void deleteBoard(Board board);

}
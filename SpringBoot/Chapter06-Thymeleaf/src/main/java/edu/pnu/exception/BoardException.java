package edu.pnu.exception;

public class BoardException extends RuntimeException{
	private static final long serianVersionUID = 1L;
	
	public BoardException(String message) {
		super(message);
	}
}

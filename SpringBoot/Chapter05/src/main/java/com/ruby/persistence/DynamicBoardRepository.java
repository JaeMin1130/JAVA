package com.ruby.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.ruby.domain.Board;

public interface DynamicBoardRepository extends JpaRepository<Board, Long>, QuerydslPredicateExecutor<Board> {
	
}

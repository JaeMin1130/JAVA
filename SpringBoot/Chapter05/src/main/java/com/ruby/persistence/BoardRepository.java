package com.ruby.persistence;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ruby.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

	List<Board> findByTitleContaining(String keyword);

	List<Board> findByTitleContainingAndCntGreaterThan(String keyword, Long val);

	List<Board> findByCntBetweenOrderByCntAsc(long l, long m);

	List<Board> findByTitleContainingOrContentContainingOrderBySeqDesc(String keyword1, String keyword2);
	
	// 위치 기반 파라미터 사용
	@Query("select b from Board b where b.title like %?1% order by b.seq desc")
	List<Board> queryAnnotationTest1(String searchKeyword);
	
	// 이름 기반 파라미터 사용
	@Query("select b from Board b where b.title like %:searchKeyword% order by b.seq desc")
	List<Board> queryAnnotationTest2(@Param("searchKeyword") String searchKeyword);
	
	// 특정 변수만 조회 + 이름 기반 파라미터
	@Query("select b.writer, b.cnt, b.createDate from Board b where b.title like %:searchKeyword% order by b.seq desc")
	List<Object[]> queryAnnotationTest3(String searchKeyword);
	
	// 네이티브 쿼리 사용
	@Query(value = "select seq, title, writer, create_date from board where title like '%'||?1||'%' order by seq desc", nativeQuery=true)
	List<Object[]> queryAnnotationTest4(String searchKeyword);
	
	// 페이징 및 정렬 처리
	@Query("select b from Board b")
	List<Board> queryAnnotationTest5(Pageable paging);
}
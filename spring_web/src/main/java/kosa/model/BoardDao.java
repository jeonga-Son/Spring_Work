package kosa.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kosa.mapper.BoardMapper;

@Repository
public class BoardDao { // Database Access Object
	@Autowired
	// sqlSessionTemplate => springapp-servlet.xml에서 만들어줬음.
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertBoard(Board board) {
		sqlSessionTemplate.getMapper(BoardMapper.class).insertBoard(board); // 이 board객체가 mybatis의 board객체까지 전달된다.
	}
	
	/*
	 * public List<Board> listBoard(){ return
	 * sqlSessionTemplate.getMapper(BoardMapper.class).listBoard(); }
	 */
	
	public List<Board> listBoard(Search search){
		return sqlSessionTemplate.getMapper(BoardMapper.class).listBoard(search);
	}

	public Board showDetailBoard(int seq){
		return sqlSessionTemplate.getMapper(BoardMapper.class).showDetailBoard(seq);
	}


}

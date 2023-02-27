package kosa.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kosa.mapper.BoardMapper;

@Repository
public class BoardDao { // Database Access Object
	@Autowired
	// sqlSessionTemplate => springapp-servlet.xml���� ���������.
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertBoard(Board board) {
		sqlSessionTemplate.getMapper(BoardMapper.class).insertBoard(board); // �� board��ü�� mybatis�� board��ü���� ���޵ȴ�.
	}
	
	public List<Board> listBoard(){
		return sqlSessionTemplate.getMapper(BoardMapper.class).listBoard();
	}
}

package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Autowired
	private BoardMapper mapper;
	
//	@Test // 단위테스트
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로운 내용");
//		board.setContent("새로 작성한 내용");
//		board.setWriter("user01");
//		
//		mapper.insert(board);
//		
//		log.info(board);
//	}
	
//	@Test 
//	public void testInsertSelectKey() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로운 내용2");
//		board.setContent("새로 작성한 내용2");
//		board.setWriter("user02");
//		
//		mapper.insert(board);
//		
//		log.info(board);
//	}

//	@Test
//	public void testReadList() {
//		List<BoardVO> list = mapper.getList();
//		list.forEach(board -> log.info(board));
////		log.info(list);
//	}
	
//	@Test
//	public void testRead() {
//		BoardVO board = mapper.read(5L);
//		
//		log.info(board);
//		
//	}
	
//	@Test
//	public void testDelete() {
//		log.info("DELETE COUNT : " + mapper.delete(3L));
//		
//	}
	
//	@Test
//	public void testUpdate() {
//		BoardVO board = new BoardVO();
//		
//		// 실행 전 존재하는 번호인지 확인할 것
//		board.setBno(5L);
//		board.setTitle("수정된 내용");
//		board.setContent("수정한 내용");
//		board.setWriter("user0123");
//		
//		int count = mapper.update(board); // 수정된 개수?
//		
//		log.info("UPDATE COUNT : " + count);
//		
//	}
	
//	@Test
//	public void testPaging() {
//		Criteria cri = new Criteria();
//		
//		List<BoardVO> list = mapper.getListWithPaging(cri);
//		
//		list.forEach(board -> log.info(board));
//	}
	
	@Test
	public void testSearch() {
		Criteria cri = new Criteria();
		cri.setKeyword("새로");
		cri.setType("TC");
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board));
	}
}

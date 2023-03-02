package org.zerock.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	@Autowired
	private BoardService service; // BoardServiceImpl로 안함.
	
//	@Test
//	public void testRegister() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로운 내용");
//		board.setContent("새로 작성한 내용");
//		board.setWriter("user01");
//		
//		service.register(board);
//	}
	
//	@Test
//	public void testRead() {
//		BoardVO board = service.get(8L);
//	}
	
	
//	@Test
//	public void testModify() {
//		BoardVO board = service.get(1L);
//		
//		if (board == null) {
//			return;
//		}
//		
//		board.setTitle("제목만 수정합니다.");
//
//		
//		log.info("MODIFY RESULT : " + service.modify(board));
//	}
	
//	@Test
//	public void testRemove() {
//		// 게시물 번호의 존재 여부를 확인하고 테스트 할 것
//		log.info("REMOVE RESULT : " + service.remove(8L));
//	}
	
	@Test
	public void testGetList() {
		List<BoardVO> list = service.getList();
		list.forEach(board -> log.info(list));
	}
}

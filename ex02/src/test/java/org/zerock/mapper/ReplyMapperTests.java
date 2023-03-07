package org.zerock.mapper;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Autowired
	private ReplyMapper mapper;
	
	private Long[] bnoArr= {5L, 6L, 7L, 8L, 9L};
 	
	@Test
	public void testCreate() {
		IntStream.range(1, 10).forEach(i -> {
			ReplyVO vo = new ReplyVO();
			
			vo.setBno(bnoArr[i%5]);
			vo.setReply("댓글 테스트" + i);
			vo.setReplyer("replyer" + i);
			
			mapper.insert(vo);
		});
	}
//	
//	@Test
//	public void testRead() {
//		ReplyVO vo = mapper.read(5L);
//		
//		log.info(vo);
//	}
//	
//	@Test
//	public void testDelete() {
//		mapper.delete(5L);
//	}
	
//	@Test
//	public void testUpdate() {
//		ReplyVO vo = mapper.read(3L);
//		vo.setReply("Update Reply");
//		
//		int count = mapper.update(vo);
//		log.info("update count: " + count);
//	}
}

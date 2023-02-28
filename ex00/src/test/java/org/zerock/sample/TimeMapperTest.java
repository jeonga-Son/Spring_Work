package org.zerock.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTest {
	@Autowired
	private TimeMapper timeMapper;
	
	@Test
	public void test() {
		// getTime()이 mapstate의 id를 호출하기 때문에 dao를 쓰지 않아도 된다.
		log.info(timeMapper.getTime()); 
	}
}

package com.company.mvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.mvc.board.BoardMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/resources/config/datasource-context.xml")
@Log4j
public class BoardMapperTest {
	@Autowired BoardMapper mapper;
	
	@Test
	public void test() {
		mapper.getList().forEach(board -> log.info(board));
	}
}

package com.company.mvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.mvc.reply.ReplyMapper;
import com.company.mvc.reply.ReplyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:config/*.xml")
public class ReplyMapperTest {

	@Autowired ReplyMapper mapper;
	
	@Test
	public void getList() {
		System.out.println(mapper.getList(1L));
	}
	
	@Test
	public void insert() {
		ReplyVO vo = new ReplyVO();
		
		vo.setBno(2L);
		vo.setReply("test!");
		vo.setReplyer("ttttt");
		
		mapper.insert(vo);
	}
	
	@Test
	public void update() {
		ReplyVO vo = new ReplyVO();
		
		vo.setReply("updateTest");
		vo.setRno(3L);
		
		mapper.update(vo);
	}
	
	@Test
	public void delete() {
		ReplyVO vo = new ReplyVO();
		
		vo.setRno(3L);
	}
}

package com.company.mvc.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	//sl4jLogger인터페이스
	Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired BoardMapper mapper;
	
	//게시글 목록
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		model.addAttribute("boardList", mapper.getList());
		return "board/boardList";
	}
	
	//게시글 등록페이지 이동
	@GetMapping("/boardInsert")
	public String boardInsert() {
		return "board/boardInsert";
	}
	
	//게시글 등록처리
	@PostMapping("/boardInsert")
	public String boardInsertProc(BoardVO vo) {
		mapper.insert(vo);
		System.out.println(vo.getWriter()+"님의 게시글 등록완료");
		return "redirect:boardList";
	}
	
	//게시글 수정페이지 이동
	@RequestMapping("/boardUpdate/{bno}")
	public String boardUpdateForm(BoardVO vo, Model model, @PathVariable String bno) {
		vo.setBno(bno);
		model.addAttribute("board", mapper.getboard(vo));
		return "board/boardUpdate";
	}
	
	//게시글 수정
	@PostMapping("/boardUpdate")
	public String boardUpdateProc(BoardVO vo) {
		mapper.update(vo);
		return "redirect:boardList";
	}
	
	//게시글 삭제
	@GetMapping("/boardDelete")
	public String boardDeleteProc(BoardVO vo) {
		mapper.delete(vo);
		return "redirect:boardList";
	}
}

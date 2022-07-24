package com.company.mvc.board;

import java.util.List;

public interface BoardMapper {
	public BoardVO getboard(BoardVO vo);
	public List<BoardVO> getList();
	public void insert(BoardVO vo);
	public void update(BoardVO vo);
	public void delete(BoardVO vo);
}

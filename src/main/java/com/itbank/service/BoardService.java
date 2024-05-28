package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;

	public List<BoardVO> getBoards() {
		return dao.selectAll();
	}

	public int insert(BoardVO input) {
		return dao.insert(input);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}

	public BoardVO view(int idx) {
		return dao.selectOne(idx);
	}

	public int update(BoardVO input) {
		return dao.update(input);
	}

}

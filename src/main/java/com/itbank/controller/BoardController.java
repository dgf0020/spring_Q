package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;
import com.itbank.vo.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService bs;

	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public String write(BoardVO input) {
		bs.insert(input);
		
		return "redirect:/";
	}

	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable int idx) {
		bs.delete(idx);
		
		return "redirect:/";
	}
	
	@GetMapping("/update/{idx}")
	public ModelAndView view(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.view(idx));
		mav.setViewName("board/update");
		
		return mav;
	}
	
	@PostMapping("/update/{idx}")
	public String update(BoardVO input) {
		bs.update(input);
		
		return "redirect:/";
	}
}

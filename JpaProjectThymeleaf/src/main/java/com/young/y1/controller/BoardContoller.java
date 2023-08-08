package com.young.y1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.young.y1.board.BoardCrudRepository;
import com.young.y1.board.BoardServiceImpl;
import com.young.y1.board.BoardVO;


@Controller
@RequestMapping("/guest/")
public class BoardContoller {
	
	@Autowired
	BoardCrudRepository bc;
	
	@Autowired
	BoardServiceImpl service;
	
	@GetMapping("list.do")
	String list(Model model) {
		System.out.println(" ===> list확인 ");
		model.addAttribute("li",bc.findAll());
		return "guest/list";
	}
	
	@GetMapping("getBoard.do")
	String getBoard(Model model, BoardVO vo) {
		service.cnt(vo);
		System.out.println(" ===> getBoard확인 ");
		model.addAttribute("m",service.getBoard(vo));
		return "guest/getBoard";
	}
}

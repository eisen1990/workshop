package com.eisen.workshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eisen.mybatis.Board;
import com.eisen.mybatis.BoardDAOService;

@Controller
public class BoardController {

	@Autowired
	private BoardDAOService boardDAOService;
	
	@RequestMapping(value = "/board")
	public ModelAndView showList()
	{
		ModelAndView result = new ModelAndView();
		List<Board> BoardList = boardDAOService.showList();
		
		result.addObject("board", BoardList);
		result.setViewName("board");
		return result;
	}
	
}

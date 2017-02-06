package com.eisen.workshop;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eisen.mybatis.Member;
import com.eisen.mybatis.MemberDAOService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private MemberDAOService memberDAOService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request) {
		ModelAndView result = new ModelAndView();
		List<Member> member = memberDAOService.getMembers();
		
		result.setViewName("home");
		result.addObject("result", member);
		logger.info("Home Controller");
		
		return result;
	}
	
}

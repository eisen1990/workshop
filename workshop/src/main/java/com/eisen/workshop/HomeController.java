package com.eisen.workshop;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eisen.Member.Member;
import com.eisen.Member.MemberDAOService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private MemberDAOService memberDAOService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request) {
		ModelAndView result = new ModelAndView();
		ArrayList<Member> member = new ArrayList<Member>();
		
		member = memberDAOService.getMembers();
		result.setViewName("home");
		result.addObject("result", member);
		
		return result;
	}
	
}

package com.eisen.workshop;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Home Controller");
		
		ModelAndView result = new ModelAndView();
		HttpSession session = request.getSession(false);
		
		if(session != null)
		{
			Member member = (Member)session.getAttribute("UserInfo");
			if(member != null) logger.info(member.get_id());
		}
		result.setViewName("home");
	
		return result;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpSession session)
	{
		ModelAndView result = new ModelAndView();
		Member member = new Member();
		member.set_id((String) request.getParameter("id"));
		member.set_password((String) request.getParameter("password"));
		if(memberDAOService.login(member))
		{
			logger.info("login ok");
			session.setAttribute("UserInfo", member);
		}
		result.setViewName("home");
		return result;
	}
	
	@RequestMapping(value = "/logout")
	public ModelAndView logout(HttpSession session)
	{
		ModelAndView result = new ModelAndView();
		session.setAttribute("UserInfo", null);
		result.setViewName("home");
		return result;
	}
	
	@RequestMapping(value = "/members")
	public ModelAndView members(HttpServletRequest request, HttpSession session)
	{
		ModelAndView result = new ModelAndView();
		List<Member> MemberList = memberDAOService.getMembers();
		
		result.addObject("result", MemberList);
		result.setViewName("members");
		return result;
	}
}

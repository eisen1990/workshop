package com.company.eisen;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.company.member.Member;
import com.company.member.MemberDAOService;

@Controller
public class HomeController {
	
	@Autowired
	public MemberDAOService memberDAOService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView Home(HttpServletRequest request)
	{
		ModelAndView result = new ModelAndView();

		result.setViewName("home");
		return result; 
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public ModelAndView insert(HttpServletRequest request)
	{
		ModelAndView result = new ModelAndView();
		Member member = new Member();
		member.set_id((String)request.getParameter("id"));
		member.set_password((String)request.getParameter("password"));
		member.set_name((String)request.getParameter("name"));
		member.set_group((String)request.getParameter("group"));
		member.set_level(Integer.parseInt(request.getParameter("level")));
		
		memberDAOService.insertMember(member);
		
		result.setViewName("home");
		return result;
	}
	
	@RequestMapping(value = "/memberlist", method = RequestMethod.GET)
	public ModelAndView list(HttpServletRequest request)
	{
		ModelAndView result = new ModelAndView();
		ArrayList<Member> MemberList = new ArrayList<Member>();
		MemberList = memberDAOService.getMember();
		
		result.addObject("list", MemberList);
		result.setViewName("memberlist");
		return result; 
	}
}

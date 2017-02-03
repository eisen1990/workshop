package com.company.eisen;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView Home(HttpServletRequest request)
	{
		ModelAndView result = new ModelAndView();
		
		result.setViewName("home");
		return result; 
	}

}

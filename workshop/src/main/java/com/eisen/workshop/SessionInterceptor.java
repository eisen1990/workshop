package com.eisen.workshop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.eisen.mybatis.Member;

public class SessionInterceptor extends HandlerInterceptorAdapter {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	      throws Exception {
		HttpSession session = request.getSession(false);
		
		if(session == null)
		{
			response.sendRedirect(request.getContextPath()+"/login");
			return false;
		}
		
		Member member = (Member)session.getAttribute("UserInfo");
		
		if(member == null)
		{
			response.sendRedirect(request.getContextPath()+"/login");
			return false;
		}
		else
		{
			
		}
	    
	    return true;
	 
	  }
	 
	  @Override
	  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
	      ModelAndView modelAndView) throws Exception {
		  String uri = request.getRequestURI();
		  logger.info(uri);
	  }

}

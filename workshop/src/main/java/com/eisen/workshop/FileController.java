package com.eisen.workshop;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileController {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	private static final String filePath = "c:\\springupload";
	
	@RequestMapping(value = "/fileupload", method = RequestMethod.POST)
	public ModelAndView upload(HttpServletRequest request) throws Exception
	{
		logger.info("file upload");
		ModelAndView result = new ModelAndView();
		MultipartHttpServletRequest mprequest = (MultipartHttpServletRequest)request;
	    MultipartFile multipartFile = null;

	    multipartFile = mprequest.getFile("file");
	    if(multipartFile.isEmpty() == false){
	    	logger.info("------------- file start -------------");
	    	logger.info("name : "+multipartFile.getName());
	    	logger.info("filename : "+multipartFile.getOriginalFilename());
	    	logger.info("size : "+multipartFile.getSize());
	    	logger.info("-------------- file end --------------\n");
	        }
	    
	    File file = new File(filePath);
	    if(file.exists() == false)
	    {
	    	file.mkdirs();
	    }
	    String storedFileName = "\\uploaded" + multipartFile.getOriginalFilename();
	    file = new File(filePath + storedFileName);
	    //transferTo 함수는 throws Exception이 필요하다
	    multipartFile.transferTo(file);
	    
	    result.setViewName("home");
		return result;
	}
	
	@RequestMapping(value = "/filedownload")
	public ModelAndView download(HttpServletResponse response)
	{
		ModelAndView result = new ModelAndView();
		
		return result;
	}
	
}

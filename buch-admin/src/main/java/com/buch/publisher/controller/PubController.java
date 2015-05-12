package com.buch.publisher.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.buch.publisher.model.PublisherVo;


@Controller(value="pubController")
@RequestMapping(value="/pub")
public class PubController {
	private static final Logger logger =LoggerFactory.getLogger(PublihserController.class);
	@RequestMapping(value="/main" )
	public  String publisherList(Model model, HttpServletRequest request,PublisherVo m ,HttpSession session) throws Exception {
		System.out.println("/pub/main");    
		return "pub/pubmain.buch";
		//return ;
	}
	
	@RequestMapping(value="/pubreg" )
	public  String pubreg(Model model, HttpServletRequest request,PublisherVo m ,HttpSession session) throws Exception {
		System.out.println("/pub/pubreg");
		
		return "pub/pubreg.buch";
		
	}
	
	@RequestMapping(value="/pubedit" )
	public String pubedit(Model model, HttpServletRequest request,PublisherVo m ,HttpSession session) throws Exception {
		System.out.println("/pub/pubedit");
		
		return "pub/pubedit.buch";
		
	}

	
	
}

package com.buch.goods.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsController {

	
	@RequestMapping(value = "/goods/goodsmain")
	public String main(Locale locale, Model model) {
		System.out.println("/goods/goodsmain");
		return "goods/goodsmain.buch";
	}
	
	@RequestMapping(value = "/goods/goodsreg")
	public String goodsreg(Locale locale, Model model) {
		System.out.println("/goods/goodsreg");
		return "goods/goodsreg.buch";
	}
	
	@RequestMapping(value = "/goods/goodsedit")
	public String goodsedit(Locale locale, Model model) {
		System.out.println("/goods/goodsreg");
		return "goods/goodsedit.buch";
	}
}

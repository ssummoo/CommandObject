package kr.co.softsoldesk.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.DataBean2;


@Controller
public class TestController {

	//#1
	/*
	  
	@PostMapping("/test1")
	public String test1(@ModelAttribute DataBean bean) {
		System.out.println("data1 : " +bean.getData1());
		System.out.println("data2 : " +bean.getData2());
		
		return "test1";
	}
	 */
	
	//#1-1 ModelAttribute 생략
	@PostMapping("/test1")
	public String test1( DataBean bean) {
		System.out.println("data1 : " +bean.getData1());
		System.out.println("data2 : " +bean.getData2());
		
		return "test1";
	}
	//#2
	@PostMapping("/test2")
	public String test2(@ModelAttribute("testBean") DataBean bean) {
		System.out.println("data1 : " +bean.getData1());
		System.out.println("data2 : " +bean.getData2());
		
		return "test2";
	}
	
	
	
	
	
}

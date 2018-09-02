package com.my.feedback.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		return mv;

	}
	
	@RequestMapping(value="/admin")
	public ModelAndView admin(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Admin");
		mv.addObject("userClickAdmin",true);
		return mv;

	}
	
	@RequestMapping(value="/student")
	public ModelAndView student(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Student");
		mv.addObject("userClickStudent",true);
		return mv;

	}
	
	@RequestMapping(value="/faculty")
	public ModelAndView faculty(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Faculty");
		mv.addObject("userClickFaculty",true);
		return mv;

	}
	@RequestMapping(value="/contact")
	public ModelAndView contact(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;

	}
	@RequestMapping(value="/about")
	public ModelAndView about(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;

	}
	@RequestMapping(value="/adminarea")
	public ModelAndView adminarea(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Admin Area");
		mv.addObject("userClickAbout",true);
		return mv;

	}
}

package com.my.feedback.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.feedback_backend.dao.CategoryDAO;
import com.my.feedback_backend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		
		mv.addObject("userClickHome", true);
		return mv;

	}

	@RequestMapping(value = "/admin")
	public ModelAndView admin() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Admin");
		mv.addObject("userClickAdmin", true);
		return mv;

	}

	@RequestMapping(value = "/student")
	public ModelAndView student() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Student");
		mv.addObject("userClickStudent", true);
		return mv;

	}

	@RequestMapping(value = "/faculty")
	public ModelAndView faculty() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Faculty");
		mv.addObject("userClickFaculty", true);
		return mv;

	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;

	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;

	}

	@RequestMapping(value = "/adminarea")
	public ModelAndView adminarea() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Admin Area");
		mv.addObject("userClickAbout", true);
		return mv;

	}
	
	
	/*
	 * methods to load all the products based on category
	 * */
	
	@RequestMapping(value =  "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		
		//passing the lise of categories
		mv.addObject("categories", categoryDAO.list());
		
		
		mv.addObject("userClickAllProducts", true);
		return mv;

	}
	
	@RequestMapping(value =  "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		
		//category to fetch a single category
		
		Category category= null;
		
		category= categoryDAO.get(id);
		
		
		mv.addObject("title",category.getName());
		
		//passing the lise of categories
		mv.addObject("categories", categoryDAO.list());
		
		//passing single category
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts", true);
		return mv;

	}
	
	
	
}

package com.bipro.ocm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
//@RequestMapping("/dash")
public class DashboardController {


	
//	 @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
////	    public ModelAndView dashboard() {
////	    	ModelAndView model = new ModelAndView();
////	    	model.addObject("users", getUsers());
////	    	model.setViewName("dashboard");
////	    	return model;
////	    }

//	@RequestMapping(value = "/create", method = RequestMethod.GET)
//	public String create (Model model){
//		System.out.println(555555);
//		return "view/dashboard";
//	}
//
//	@RequestMapping(value = "/home", method=RequestMethod.GET)
//	public String home() {
//		return "site.homepage";
//	}
//
//	@RequestMapping(value = "/greet", method=RequestMethod.GET)
//	public ModelAndView greet(@RequestParam(value = "name", required=false, defaultValue="World!")final String name, final Model model) {
////		log.info("Controller has been invoked with Request Parameter name = '" + name + "'.");
//		return new ModelAndView("site.greeting", "name", name);
//	}

}

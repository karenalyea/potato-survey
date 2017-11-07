package com.libertymutual.goforcode.hello_world_again.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private int russetCount;
	private int sweetCount;
	private int goldenCount;
	private int newCount;

	@RequestMapping("/")
	public String defaultPage() {
		return "potato";
	}

	@RequestMapping("/twice-baked")
	public ModelAndView twiceBaked() {
		ModelAndView carbs = new ModelAndView();
		carbs.setViewName("spuds");
		carbs.addObject("variety", "red");
		carbs.addObject("temperature", 428);
			
		return carbs;	
		
		
	}

	@RequestMapping("/survey")
	public ModelAndView survey(String answer) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Results");
		mv.addObject("userResponse", answer);
		
		
		if (answer.equals("Russet")) {
	//		russetCount = russetCount + 1;
			russetCount += 1;
		}
		if (answer.equals("Sweet")) {
			sweetCount = sweetCount + 1;
		}
		if (answer.equals("Golden")) {
			goldenCount = goldenCount + 1;
		}
		if (answer.equals("New")) {
			newCount = newCount +1;
		}
		mv.addObject("russetCount", russetCount);
		mv.addObject("sweetCount", sweetCount);
		mv.addObject("goldenCount", goldenCount);
		mv.addObject("newCount", newCount);
			
		return mv;
		
	}
}
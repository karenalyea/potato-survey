package com.libertymutual.goforcode.hello_world_again.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.hello_world_again.models.SurveyResults;

@Controller
public class HomeController {
	
	private SurveyResults results = new SurveyResults();
	
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
		carbs.addObject("arbitraryImage", "https://nkxms1019hx1xmtstxk3k9sko-wpengine.netdna-ssl.com/wp-content/uploads/2013/02/figest.jpg");
		return carbs;	
		
		
	}

	@RequestMapping("/survey")
	public ModelAndView survey(String answer) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Results");
		mv.addObject("userResponse", answer);
		
		
		if (answer.equals("Russet")) {
			results.registerRussetVote();
		}
		if (answer.equals("Sweet")) {
			results.registerSweetVote();
		}
		if (answer.equals("Golden")) {
			results.registerGoldenVote();
		}
		if (answer.equals("New")) {
			results.registerNewVote();
		}
		mv.addObject("results", results);
		
			
		return mv;
		
	}
}

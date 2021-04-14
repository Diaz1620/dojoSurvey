package com.yadiel.dojoSurvey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	
	@RequestMapping("")
	public String surveyForm() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/survey", method=RequestMethod.POST)
	public String surveyAnswers(@RequestParam(value="name") String name, @RequestParam(value="selectLocation") String selectLocation, @RequestParam(value="selectLang") String selectLang, @RequestParam(value="comment") String comment, HttpSession session) {
		
		session.setAttribute("name", name);
		session.setAttribute("selectLocation", selectLocation);
		session.setAttribute("selectLang", selectLang);
		session.setAttribute("comment", comment);
		
	
		return "redirect:/show";
	}
	
	@RequestMapping("/show")
	public String showItAll() {
		return "show.jsp";
	}
	
}

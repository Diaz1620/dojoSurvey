package com.yadiel.dojoSurvey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DojoSurveyApplication {
	
	@RequestMapping("/hello")
	public String greeting() {
		return "Well hello there...";
	}

	public static void main(String[] args) {
		SpringApplication.run(DojoSurveyApplication.class, args);
	}

}

package com.practice.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value="/about",method = RequestMethod.GET)
	public String about(Model model) {
		
		System.out.println("inside about hndlr");
		
		model.addAttribute("name","kishlay");
		model.addAttribute("currentDate",new java.util.Date().toLocaleString());
		return "about.html";
	}
	@GetMapping("/example-loop")
	public String interateHandler(Model m) {
		
		List<String> name = List.of("krish","chandan","gayatri");
		m.addAttribute("name", name);
		return "iterate";
	}
	
	@GetMapping("/condition")
	public String conditionerHandler(Model m) {
	
		m.addAttribute("isActive", true);
		
		return "condition";
	}
	
	@GetMapping("/service")
	public String serviceHandler(Model m) {
		m.addAttribute("title","I like to eat");
		m.addAttribute("subtitle", LocalDateTime.now().toString());
		return "service";
	}
	
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutnew";
	}
	
}
 
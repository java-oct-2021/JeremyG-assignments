package com.jeremy.displaydate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class DisplayControllers {
	
	public Date display() {
		Date dt = new Date();
		return dt;
	}
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/date")
	public String date(Model model) {
		model.addAttribute("date", display());
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		model.addAttribute("time", display());
		return "time.jsp";
	}
	
	
}

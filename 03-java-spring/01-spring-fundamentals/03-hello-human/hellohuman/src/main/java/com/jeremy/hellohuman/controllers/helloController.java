package com.jeremy.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false, defaultValue = "Human") String firstName) {
		
		return "Hello " + firstName;
	}
}

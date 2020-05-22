package de.runds.arbeitsprobe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@RequestMapping("/")
	public String home(){
		
		return "home";
		
	}
}

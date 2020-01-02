package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
	
	@RequestMapping("/home")
	public String homePage() {
		return "Springboot is working now!!!";
	}

}


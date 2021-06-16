package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WildController {

	@GetMapping("")
	public String afficherIndex() {
		return "/index.html";
	}
	
	@GetMapping("/atelier/af")
	@ResponseBody
	public String afficherContenu() {
		return "introduction a Spring ";
	}
}

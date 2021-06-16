package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

	@GetMapping("/doctor/1")
	@ResponseBody
	public String williamHartnell() {
		return "WILLIAM HARTNELL";
	}

	@GetMapping("/doctor/10")
	@ResponseBody
	public String davidTEnnant() {
		return "david tennat ";
	}

	@GetMapping("/doctor/13")
	@ResponseBody
	public String jodieW() {
		return "jodieWhittaker";
	}

}

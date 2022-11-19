package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg = "welcome to controller class";
		return msg;
	}
	
}

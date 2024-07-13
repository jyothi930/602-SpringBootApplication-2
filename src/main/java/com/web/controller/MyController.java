package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/home")
	public String indexpage() {
		return "index";
	}
	 @RequestMapping("/abouturl")
	public String aboutpage() {
		return "about";
	}
	 @RequestMapping("/contacturl")
		public String contactpage() {
			return "contact";
		}
	 @RequestMapping("/login")
		public String loginpage() {
			return "login";
		}
	 @RequestMapping("/register")
		public String registerpage() {
			return "reg";
		}

}

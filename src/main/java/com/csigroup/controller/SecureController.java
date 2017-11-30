package com.csigroup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecureController {
		
		@RequestMapping("/secure/home")
		public String firstPageController() {
			
			return "secure.home";
		}
}

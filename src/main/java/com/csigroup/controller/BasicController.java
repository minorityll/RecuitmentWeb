package com.csigroup.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.csigroup.util.MessageBuddle;

@Controller
@RequestMapping("/")
public class BasicController {
	@RequestMapping("/{locale}/login")
	public ModelAndView loginController(@PathVariable("locale") String locale,
			HttpServletRequest request
			) {
		HttpSession session = request.getSession();
		if(locale.equals("th")) {
			session.setAttribute("LOCALE", "th_TH");
		}else {
			session.setAttribute("LOCALE", "en_US");
		}
		
		return new ModelAndView("login");
	}
	
	@RequestMapping("/login")
	public ModelAndView loginBasicController(
			HttpServletRequest request
			) {
		return new ModelAndView("login");
	}
	
	@RequestMapping("/forceInitMessage")
	public void switchLocale(HttpServletRequest req
			,HttpServletResponse resp
			) throws IOException {
			try {
				MessageBuddle.getInstance().forceInitMessage();
			} catch (Exception  e) {
				try {
					resp.sendRedirect("secure/home");
				} catch (IOException e1) {
					resp.sendError(404);
				}
			}
		}
	
	@RequestMapping("/accessDeny")
	public ModelAndView accessDeny() {
		return new ModelAndView("/accessDeny");
	}
	
	
//	@RequestMapping("/secure/home")
//	public ModelAndView secureController() {
//		return new ModelAndView("/secure/home");
//	}
}

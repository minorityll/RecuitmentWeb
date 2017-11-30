package com.csigroup.controller;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LocaleSetting {
	
	
	
	
		@RequestMapping("locale")
		public void switchLocale(HttpServletRequest req
				,HttpServletResponse resp
				,@RequestParam("locale")String locale
				) throws IOException {
//				Locale.setDefault(new Locale(locale));
				req.getSession().setAttribute("LOCALE", locale);
				try {
					resp.sendRedirect(req.getHeader(HttpHeaders.REFERER));
				} catch (IOException e) {
					try {
						resp.sendRedirect("secure/home");
					} catch (IOException e1) {
						resp.sendError(404);
					}
				}
			}
}

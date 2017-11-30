package com.csigroup.security;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class AuthenicationSuccessHeandler implements AuthenticationSuccessHandler  {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication auth)
			throws IOException, ServletException {
		HttpSession session = req.getSession(true);
		session.setAttribute("LOCALE", "th_TH");
		session.setAttribute("username", auth.getName());
		Collection list =  auth.getAuthorities();
		for (Object c : list) {
			SimpleGrantedAuthority obj = (SimpleGrantedAuthority) c;
			System.out.println(obj.getAuthority());
		}
		 
		
		if(auth.getAuthorities().contains("admin")){
			resp.sendRedirect("secure/home");
//			req.getRequestDispatcher(null).forward(arg0, arg1);
		}else {
			resp.sendRedirect("secure/home");
		}
		// TODO Auto-generated method stub
		
	}

}

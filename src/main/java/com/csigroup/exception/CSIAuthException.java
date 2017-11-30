package com.csigroup.exception;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.AuthenticationException;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class CSIAuthException extends AuthenticationException{

	public CSIAuthException(String msg, Throwable t) {
		super(msg, t);
	}
	public CSIAuthException(String msg) {
		super(msg);
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpSession session = attr.getRequest().getSession();
		session.setAttribute("LAST_EXCEPTION", msg);
	}
}

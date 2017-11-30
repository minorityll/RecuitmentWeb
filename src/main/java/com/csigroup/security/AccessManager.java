package com.csigroup.security;

import java.util.Collection;

import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.FilterInvocation;
import org.springframework.stereotype.Service;
@Service("AccessManager")
public class AccessManager implements AccessDecisionVoter<Object>{

	@Override
	public boolean supports(ConfigAttribute arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean supports(Class arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int vote(Authentication auth, Object obj, Collection permit) {
		FilterInvocation in = (FilterInvocation) obj;
		System.out.println(in.getFullRequestUrl() +" : "+ permit);
//		if(auth.getName().equals("admin")) {
//			return ACCESS_DENIED;
//		}
		if(	permit.contains("authenticated")) {
			
			
			return ACCESS_GRANTED;
		}else {
			return ACCESS_GRANTED;
		}
		
	}


}

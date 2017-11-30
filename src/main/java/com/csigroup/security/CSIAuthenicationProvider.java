package com.csigroup.security;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.jboss.logging.annotations.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.csigroup.entity.AuthMUser;
import com.csigroup.entity.AuthMUserRole;
import com.csigroup.exception.CSIAuthException;
import com.csigroup.service.UserAuthenicationServiceDao;
import com.csigroup.util.MessageBuddle;

@Service
public class CSIAuthenicationProvider implements AuthenticationProvider {

	@Autowired
	UserAuthenicationServiceDao userService;
	
	@Autowired
	@Qualifier("MessageBuddle")
	MessageBuddle buddle;
	@Autowired
	PasswordEncoder encoder ;
 
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
//		HttpSession session = attr.getRequest().getSession();
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		if(StringUtils.isBlank(authentication.getName())) {
			throw new CSIAuthException( buddle.getEnglishMessage("msg.error.blankuser"));
		}
		
		AuthMUser userM = userService.findByUser(authentication.getName());
		if(userM==null) {
			throw new CSIAuthException( buddle.getEnglishMessage("msg.error.usernotfound"));
		}
		if(!encoder.matches(authentication.getCredentials().toString(), userM.getPassWord())) {
			throw new CSIAuthException( buddle.getEnglishMessage("msg.error.passwordnotmatch"));
		}
		
		List<AuthMUserRole> role = userM.getAuthUserRoles();
		for (AuthMUserRole c : role) {
			authorities.add(new SimpleGrantedAuthority(c.getRoleShortName()));
		}
		
		User user = new User(authentication.getName(), authentication.getCredentials().toString(), authorities);
		return new UsernamePasswordAuthenticationToken(user, authentication.getCredentials().toString(), authorities);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

}

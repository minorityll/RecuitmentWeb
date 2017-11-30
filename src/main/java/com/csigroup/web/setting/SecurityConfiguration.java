package com.csigroup.web.setting;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.security.access.vote.AuthenticatedVoter;
import org.springframework.security.access.vote.RoleVoter;
import org.springframework.security.access.vote.UnanimousBased;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.expression.WebExpressionVoter;

import com.csigroup.security.AccessManager;
import com.csigroup.security.AuthenicationSuccessHeandler;
import com.csigroup.security.CSIAuthenicationProvider;

@Configuration
@EnableWebSecurity
@ComponentScan(value= { "com.csigroup.util" ,"com.csigroup.security"})
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
    @Qualifier("customUserDetailsService")
    UserDetailsService userDetailsService;
	
	@Autowired
	@Qualifier("AccessManager")
	AccessDecisionVoter accessVoter;
	
	@Autowired
	CSIAuthenicationProvider cSIAuthenicationProvider;

//    @Autowired
//    PersistentTokenRepository tokenRepository;
 
    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService);
        auth.authenticationProvider(cSIAuthenicationProvider);
        auth.inMemoryAuthentication().withUser("admin").password("password").roles("admin");
    }
    
    @Bean
    public AccessDecisionManager accessDecisionManager() {
        List<AccessDecisionVoter<? extends Object>> decisionVoters 
          = Arrays.asList(
            new WebExpressionVoter(),
            new RoleVoter(),
            new AuthenticatedVoter()
            , new AccessManager() 
            );
        return new UnanimousBased(decisionVoters);
    }
 
    
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        		.antMatchers("/sucure/**").authenticated()
                .antMatchers("/user/**").authenticated()
                .antMatchers("/edit-user-*").access("hasRole('ADMIN') or hasRole('DBA')")
                
                .accessDecisionManager(accessDecisionManager())
	             .antMatchers("/resources/**").permitAll()
	             .antMatchers("/login","/j_spring_security").permitAll()
	             .anyRequest().authenticated()
                .and().formLogin().loginPage("/login")
                .loginProcessingUrl("/j_spring_security").usernameParameter("j_username").passwordParameter("j_password")
                .successHandler(new AuthenicationSuccessHeandler())
                .and().exceptionHandling().accessDeniedPage("/accessDeny")
                .and().logout().logoutUrl("/logout")
//                .and().csrf()
                ;
                
                http.csrf().disable();
//                http.headers().frameOptions().disable();
    }
 
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
 
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//        authenticationProvider.setUserDetailsService(userDetailsService);
//        authenticationProvider.setPasswordEncoder(passwordEncoder());
//        return authenticationProvider;
//    }
 
//    @Bean
//    public PersistentTokenBasedRememberMeServices getPersistentTokenBasedRememberMeServices() {
//        PersistentTokenBasedRememberMeServices tokenBasedservice = new PersistentTokenBasedRememberMeServices(
//                "remember-me", userDetailsService, tokenRepository);
//        return tokenBasedservice;
//    }
 
    @Bean
    public AuthenticationTrustResolver getAuthenticationTrustResolver() {
        return new AuthenticationTrustResolverImpl();
    }
}

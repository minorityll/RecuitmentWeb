package com.csigroup.web.setting;

import java.nio.charset.Charset;

import javax.annotation.PostConstruct;

import org.springframework.config.java.annotation.Import;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import com.csigroup.tiles.AutoTilesView;

@EnableWebMvc //mvc:annotation-driven
@Configuration
@ComponentScan({ "com.csigroup.web.setting","com.csigroup.service","com.csigroup.repository","com.csigroup.util" , "com.csigroup.controller","com.csigroup.security"})
public class SpringWebConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate rest = new RestTemplate();
		rest.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
		return rest;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
 //Enable tiles3
	 	@Bean
	    public TilesConfigurer tilesConfigurer(){
	        TilesConfigurer tilesConfigurer = new TilesConfigurer();
	        tilesConfigurer.setDefinitions(new String[] {"/tiles3/tiles-config.xml"});
	        tilesConfigurer.setCheckRefresh(true);
	        return tilesConfigurer;
	    }
	 
	    @Override
	    public void configureViewResolvers(ViewResolverRegistry registry) {
	    	TilesViewResolver viewResolver = new TilesViewResolver();
	    	viewResolver.setViewClass(AutoTilesView.class);
	    	viewResolver.setOrder(1);
	    	registry.viewResolver(viewResolver);
	    	
	    	InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
	        internalResourceViewResolver.setViewClass(JstlView.class);
	        internalResourceViewResolver.setPrefix("/jsp/");
	        internalResourceViewResolver.setSuffix(".jsp");
	        internalResourceViewResolver.setOrder(2);
	        registry.viewResolver(internalResourceViewResolver);
	    	
	    }

//	@Bean
//	public InternalResourceViewResolver viewResolver() {
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//		viewResolver.setViewClass(JstlView.class);
//		viewResolver.setPrefix("/jsp/");
//		viewResolver.setSuffix(".jsp");
//		viewResolver.setOrder(2);
//		return viewResolver;
//	}
	
//	 @Bean
//	    public MessageSource messageSource() {
//	        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//	        messageSource.setBasename("messages");
//	        return messageSource;
//	    }
}

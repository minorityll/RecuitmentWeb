package com.csigroup.util;

import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SettingBuddle {
	
	private static Logger log = Logger.getLogger(SettingBuddle.class);
	private static Map<String, String> setting ;
	private static SettingBuddle me ;
	
	@Autowired		
	@Qualifier("dataSource")
	private DataSource dataSource ;
	
	public static SettingBuddle getInstance() {
		if(me==null) {
			me= new SettingBuddle();
		}
		return me;
	}
	
	public void init() {
		if(setting==null) {
			
		}
	}
	
}

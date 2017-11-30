package com.csigroup.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class MessageBuddle {
	private static Logger log = Logger.getLogger(MessageBuddle.class);
	
	private static Map<String, Map<String,String>> message ;
	
	static MessageBuddle me = null;
	@Bean(name="MessageBuddle",initMethod="init")
	public static MessageBuddle getInstance() {
		if(me==null) {
			me = new MessageBuddle();
		}
		return me;
	}
	
	public Map<String, Map<String,String>> getMessage() {
		return message;
	}


	@Autowired
	private ApplicationContext appContext;
	
	@Autowired		
	private DataSource dataSource ;
		
	public DataSource getDataSource() {
		return dataSource;
	}
	
	public void forceInitMessage() {
		message=null;
		init();
	}
	
 	public  void init() {
 			if(message ==null) {
 				log.info("############# initialize Properties ##############");
 				Map<String, Map<String,String>> map = new HashMap<>();
 				Connection conn =null;
 				PreparedStatement ps =null;
 				ResultSet rs =null;
 				try {
 				conn =  dataSource.getConnection();
 				ps = conn.prepareStatement(" SELECT * FROM tblMessage ");
 				rs= ps.executeQuery();
 				while(rs.next()) {
 					if(map.get(rs.getString("CODE"))!=null ) {
 						map.get(rs.getString("CODE")).put(rs.getString("LOCALE"), rs.getString("DATA"));
 					}else {
 						Map<String, String> data = new HashMap<>();
 						data.put(rs.getString("LOCALE"), rs.getString("DATA"));
 						map.put(rs.getString("CODE"), data);
 					}
 				}
 				
 				message = map;
 				}catch (Exception e) {
 					log.error(e);
 					e.printStackTrace();
				}finally {
					try {
						if(conn!=null)conn.close();
						if(ps!=null)ps.close();
						if(rs!=null)rs.close();
					}catch (Exception e) {
						log.error("Cannot Close Connection :"+e);
	 					e.printStackTrace();
					}
				}
 			}
    }	
 	
 	public  String getMessage(String code,String locale,String[] param) {
 		if(message ==null) {
 			init();
 		}
 			String ret =this.getMessage(code, locale);
 			int i =0;
	 		for(String c: param) {
	 			ret =  ret.replaceFirst("?" , param[i]);
	 		}
 		return ret;
 	}
 	
 	public  String getMessage(String code,String locale) {
 		if(message ==null) {
 			init();
 		}
 			if(message.get(code)==null) {
				return "";
			}
 			String ret = message.get(code).get(locale);
 		return ret!=null?ret:"";
 	}
 	
	public  String getEnglishMessage(String code) {
 			String locale = "en_US";
 			String ret =this.getMessage(code, locale);
 		return ret;
 	}
	
	public  String getThaiMessage(String code) {
 			String locale = "th_TH";
 			String ret = this.getMessage(code, locale);
 		return ret;
 	}
}

package com.csigroup.controller;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.csigroup.entity.EmployeeEntity;
import com.csigroup.service.UserAuthenicationServiceDao;
import com.csigroup.util.MessageBuddle;
@Controller
public class MyController {
	
	@PersistenceContext
    EntityManager em;
	
	@Autowired
	UserAuthenicationServiceDao userAuthenicationServiceDao;
	
//	@Autowired		
//	@Qualifier("dataSource")
//	private DataSource dataSource ;
	
	@RequestMapping("/home")
	public ModelAndView homeController() {
		MessageBuddle.getInstance().init();
//		System.out.println("some thing");
//		Query q =  em.createNativeQuery(" SELECT * FROM DBO.EMPLOYEE ",EmployeeEntity.class);
//		List<EmployeeEntity> list = q.getResultList();
//		List<Object[]> list = q.getResultList();
//		for (Object[] c : list) {
//			System.out.println(c);
//		}
//		
		return new ModelAndView("home");
	}
}

package com.csigroup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csigroup.entity.AuthMUser;
import com.csigroup.repository.UserAuthenicationRespositoryDAO;

@Service("UserAuthenicationServiceDao")
public class UserAuthenicationServiceDaoImpl implements UserAuthenicationServiceDao{
	
	@Autowired
	UserAuthenicationRespositoryDAO dao;

	public AuthMUser findByUser(String username) {
		return dao.findByUser(username);
	}
	
}

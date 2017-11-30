package com.csigroup.service;

import com.csigroup.entity.AuthMUser;

public interface UserAuthenicationServiceDao {
	public AuthMUser findByUser(String username);
}

package com.csigroup.repository;

import com.csigroup.entity.AuthMUser;

public interface UserAuthenicationRespositoryDAO {
	public AuthMUser findByUser(String username);
}

package com.csigroup.repository;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.csigroup.base.AbstractDao;
import com.csigroup.entity.AuthMUser;

@Repository("UserAuthenicationRespositoryDAO")
public class UserAuthenicationRespositoryDAOImpl
				extends AbstractDao<Integer, AuthMUser> 
					implements UserAuthenicationRespositoryDAO{
		@Override
		public AuthMUser findByUser(String username) {
			Query q  =  getEntityManager().createQuery(" FROM AuthMUser WHERE userName =:username  ", AuthMUser.class);
			q.setParameter("username", username);
			List<AuthMUser> list = q.getResultList();
			if(list.size()>0) {
				return list.get(0);
			}
			return null;
		}
	
}

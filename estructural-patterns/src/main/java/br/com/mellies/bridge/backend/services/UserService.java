package br.com.mellies.bridge.backend.services;

import br.com.mellies.bridge.backend.dao.UserDao;
import br.com.mellies.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}

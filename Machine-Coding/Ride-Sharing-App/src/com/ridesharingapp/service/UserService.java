package com.ridesharingapp.service;

import com.ridesharingapp.dao.UserDao;
import com.ridesharingapp.model.User;

public class UserService {
	public void addUser(User newUser) {
		UserDao userDao = UserDao.getInstance();
		// TODO validations
		userDao.addUser(newUser);
	}
}

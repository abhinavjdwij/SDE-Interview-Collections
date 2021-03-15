package com.ridesharingapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.ridesharingapp.model.User;

public class UserDao {
	private static UserDao instance = null;
	List<User> userList;
	private UserDao() {
		this.userList = new ArrayList<>();
	}
	public static UserDao getInstance() {
		if (instance == null) {
			instance = new UserDao();
		}
		return instance;
	}
	public void addUser(User newUser) {
		this.userList.add(newUser);
	}
}

package com.event.service;

import java.util.List;

import com.event.model.User;

public interface UserService{

	User addUser(User user);
	User getUser(String id);
	List<User> getUsers();
	
}

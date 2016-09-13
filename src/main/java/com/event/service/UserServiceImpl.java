package com.event.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.dao.UserDAO;
import com.event.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDAO;

	@Override
	public User addUser(User user) {
		user.setCreatedDate(new Date());
		return userDAO.save(user);
	}

	@Override
	public User getUser(String id) {
		return userDAO.findOne(id);
	}

	@Override
	public List<User> getUsers() {
		return userDAO.findAll();
	}

}

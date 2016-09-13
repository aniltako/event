package com.event.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.event.model.User;

@Repository
public interface UserDAO extends MongoRepository<User, String>{

}

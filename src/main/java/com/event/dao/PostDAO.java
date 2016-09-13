package com.event.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.event.model.Post;

@Repository
public interface PostDAO extends MongoRepository<Post, String>{

	List<Post> findAllByOrderByCreatedDateAsc();
}

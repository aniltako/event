package com.event.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.dao.PostDAO;
import com.event.model.Post;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostDAO postDAO;

//	@Autowired
//	MongoOperations mongoOperation;
	
	@Override
	public Post createPost(Post post) {
		post.setCreatedDate(new Date());
		return postDAO.save(post);
	}

	@Override
	public List<Post> getPostByCreatedDate() {
		return postDAO.findAllByOrderByCreatedDateAsc();
	}

	/*@Override
	public String addComment(Comment comment, String postId) {
		
		comment.setCreatedDate(new Date());

		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(postId));
		
		Update update = new Update();
		update.push("comments", comment);
		
//		mongoOperation.updateFirst(query, update, Post.class);
		
		return "commented";
	}
*/
}

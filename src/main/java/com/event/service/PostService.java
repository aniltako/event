package com.event.service;

import java.util.List;


import com.event.model.Post;


public interface PostService{

	Post createPost(Post post);
	List<Post> getPostByCreatedDate();
//	String addComment(Comment comment, String postId);
}

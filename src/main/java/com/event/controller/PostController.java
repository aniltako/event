package com.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.event.model.Post;
import com.event.service.PostService;

@RestController
public class PostController {

	@Autowired
	PostService postService;
	
	@RequestMapping(value="/create/post",method = RequestMethod.POST)
	public Post createPost(@RequestBody Post post){
		return postService.createPost(post);
	}
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public List<Post> getPosts(){
		return postService.getPostByCreatedDate();
	}
	
	/*@RequestMapping(value = "/add/comment", method = RequestMethod.POST)
	public String addComment(@RequestBody Comment comment, @RequestParam String postId){
		
		return postService.addComment(comment, postId);
	}*/
}

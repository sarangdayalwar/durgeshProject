package com.example.sarang.service;

import java.util.List;


import com.example.sarang.entities.Post;
import com.example.sarang.payload.PostDto;
import com.example.sarang.payload.PostResponse;

public interface PostService {

	
	//create
	
	PostDto craetePost (PostDto postDto, Integer userId,	Integer categoryId);
	
	
	//update
	
	PostDto updatePost (PostDto postDto ,Integer postId);
	
	
	//delete
	
	void deletePost(Integer postId);
	
	
	//get aLL POSTS
	
 	 PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy,String sortDir);
	
	
	
	//get single post
	
	
	PostDto getPostById(Integer postId);
	
	
	//get All posts by category
	
	List <PostDto> getPostsByCategory(Integer categoryId);
	
	// get all post by user
	
	List <PostDto> getPostsByUser(Integer userId);
	
	//search post 
	 public List<PostDto> searchPosts(String keyword);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}

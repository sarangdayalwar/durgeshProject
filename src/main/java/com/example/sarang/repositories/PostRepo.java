package com.example.sarang.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sarang.entities.Category;
import com.example.sarang.entities.Post;
import com.example.sarang.entities.User;

public  interface PostRepo extends JpaRepository< Post, Integer> {
	
	List <Post> findByUser (User user);
	List<Post> findByCategory(Category category);
    List<Post> findByTitleContaining(String title);
}

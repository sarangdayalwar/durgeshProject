package com.example.sarang.service;

import java.util.List;


import com.example.sarang.payload.CategoryDto;

public  interface CategoryService {

	//create
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	//delete
	
	public void deleteCategory(Integer categoryId);
	
	// get
	
	public CategoryDto getCategory(Integer categoryId);
	
	//getAll
	
	List<CategoryDto> getCategories();  
	
	
	
	
}

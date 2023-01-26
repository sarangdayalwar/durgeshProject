package com.example.sarang.service.impl;

import java.util.List;



import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sarang.entities.Category;
import com.example.sarang.exception.ResourceNotFoundException;
import com.example.sarang.payload.CategoryDto;
import com.example.sarang.repositories.CategoryRepo;
import com.example.sarang.service.CategoryService;



@Service
public class CategoryServiceImpl implements CategoryService {
	
	
	@Autowired
	private CategoryRepo categoryRepo;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
       Category map = this.modelMapper.map(categoryDto,Category.class);
              Category save = categoryRepo.save( map);

		return  this.modelMapper.map(save,CategoryDto.class) ;
	}
	
	 
	
	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		 Category category = this.categoryRepo.findById(categoryId)
			.orElseThrow(() -> new ResourceNotFoundException("Category", "Category Id", categoryId));
		 category.setCategoryTitle( categoryDto.getCategoryTitle());
		 category.setCategoryDescription(categoryDto.getCategoryDescription() );
		 Category category2 = this.categoryRepo.save( category);

		return  this.modelMapper.map(category2,  CategoryDto.class);
	}


	

	@Override
	public void deleteCategory(Integer categoryId) {
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category", "category Id", categoryId));
		this.categoryRepo.delete(cat);

	}



	@Override
	public List<CategoryDto> getCategories() {
		List<Category> categories = this.categoryRepo.findAll();
		List<CategoryDto> catDtos = categories.stream().map((cat)->this.modelMapper.map(cat, CategoryDto.class)).collect(Collectors.toList());
		return catDtos ;
	
	}



	@Override
	public CategoryDto getCategory(Integer categoryId) {
Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category", "category Id", categoryId));
		
		return this.modelMapper.map(cat, CategoryDto.class);
		
	}



	}


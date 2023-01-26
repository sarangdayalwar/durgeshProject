package com.example.sarang.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CategoryDto {

	
	
	private Integer categoryId;
	
	
	@NotBlank
	@Size(min = 20,message = "min size of category title is 20")
	private String categoryTitle;
	
	@NotBlank
	@Size(max = 30,message = "min size of category desc is 30")
	private String categoryDescription;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	@Override
	public String toString() {
		return "CategoryDto [categoryId=" + categoryId + ", categoryTitle=" + categoryTitle + ", categoryDescription="
				+ categoryDescription + "]";
	}

	public CategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	
		
	}
	


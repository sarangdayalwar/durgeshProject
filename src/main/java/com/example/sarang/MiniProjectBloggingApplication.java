package com.example.sarang;



import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.sarang.entities.Category;

@SpringBootApplication
public class MiniProjectBloggingApplication {

	public static void main(String[] args) {
	 SpringApplication.run(MiniProjectBloggingApplication.class, args);
	 
  Category cat=new Category();
	 cat.setCategoryDescription(null);
	 
	}
     	 
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
		
	}
     
     
     
     
	
     
     
}


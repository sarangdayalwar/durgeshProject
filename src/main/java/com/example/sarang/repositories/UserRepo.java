package com.example.sarang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sarang.entities.User;

public  interface UserRepo  extends  JpaRepository< User, Integer>{
	

}

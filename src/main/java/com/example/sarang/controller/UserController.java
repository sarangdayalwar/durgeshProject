package com.example.sarang.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sarang.payload.ApiResponse;
import com.example.sarang.payload.UserDto;
import com.example.sarang.service.UserServiceI;

@RestController
@RequestMapping("/api/users")
public class UserController {

	// post-create user
	// put- update user
	// DELETE-delete user
	// get-user

	@Autowired
	private UserServiceI userServiceI;

	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@Valid@RequestBody UserDto userDto) {
		UserDto createUser = this.userServiceI.createUser(userDto);
		return new ResponseEntity<>(createUser, HttpStatus.CREATED);

	}

	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid@RequestBody UserDto userDto, @PathVariable Integer userId) {
		UserDto updateUser = this.userServiceI.updateUser(userDto, userId);

		return new ResponseEntity<>(updateUser, HttpStatus.OK);

	}

	//delete user
		@DeleteMapping("/{userId}")
		public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer userId){
			this.userServiceI.deleteUser(userId);
			return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted Successfully",true),HttpStatus.OK);}




	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getAllUser(@PathVariable Integer userId) {

		return ResponseEntity.ok(this.userServiceI.getUserById(userId));

	}

}

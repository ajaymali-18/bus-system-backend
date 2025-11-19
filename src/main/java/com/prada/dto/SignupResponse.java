package com.prada.dto;

import lombok.Data;

@Data
public class SignupResponse {
	private String message;
}


//1

//SignupResponse is used to
// Send a clean structured response
// Avoid sending full user data
// Make API professional



//2
//our backend uses a response DTO (like SignupResponse) to send a message to the frontend about what happened, such as:
//
//User registered successfully
//
//User already exists
//
//Login successful
//
//Invalid password
//
//User not found
//
//This is exactly why we create response DTOs.
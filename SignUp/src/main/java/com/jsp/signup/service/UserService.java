package com.jsp.signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.signup.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void saveUser(int userId, String userName, String userPasword, String userEmail) {
		userRepository.saveUser(userId, userName, userPasword, userEmail);
	}

}

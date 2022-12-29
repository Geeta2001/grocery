package com.grocery.service;

import com.grocery.dto.UserDTO;
import com.grocery.entity.User;

public interface UserService {
	public User registerUser(UserDTO userdto);
	
	public User loginUser(UserDTO userdto);
	
	
}

package com.cms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.UserDao;
import com.cms.Models.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao udao;

	@Override
	public String registerUser(User user) {
		
		try {
			user.setRole("ROLE_USER");
			user.setImage("https://cdn-icons-png.flaticon.com/128/3135/3135715.png");
			udao.save(user);
			return "Usre registered successfully";
		}catch(Exception e){
			return "Something went wrong";
		}
	}

}
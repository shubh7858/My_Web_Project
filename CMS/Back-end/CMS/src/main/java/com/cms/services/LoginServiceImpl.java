package com.cms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.UserDao;
import com.cms.Models.User;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserDao udao;
	
	@Override
	public String validateEmail(String email) {
		
		User user = udao.findByEmail(email);
		
		if(user != null)
			return "User Found";
		else
			return "User Not Found";
	}
}

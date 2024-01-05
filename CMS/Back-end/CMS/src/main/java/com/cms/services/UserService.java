package com.cms.services;

import com.cms.Models.User;
import com.cms.dto.ProfileDto;

public interface UserService {

	public String registerUser(User user);
	
	public ProfileDto getData(User user);
	
	public String updateName(User user);

	public String updateEmail(User user);

}
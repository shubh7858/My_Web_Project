package com.cms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.UserDao;
import com.cms.dto.ProfileDto;
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
	
	@Override
	public ProfileDto getData(User user) {
	  long userId = user.getId();
	  ProfileDto pDto = new ProfileDto();
	  try {
	    User u = udao.findById(userId).orElse(null);
	    if(u != null) {
	      String image = u.getImage();
	      String name = u.getName();
	      String email = u.getEmail();
	      pDto.setImage(image);
	      pDto.setName(name);
	      pDto.setEmail(email);
	      pDto.setStatus(200);
	      pDto.setMessage("Data fetched");
	      return pDto;
	    }
	    else {
	      pDto.setStatus(500);
	      pDto.setMessage("User not found");
	    }
	  }catch(Exception e) {
	    pDto.setStatus(500);
	    pDto.setMessage(e.toString());
	    return pDto;
	  }
	  return pDto;
	}

	@Override
	public String updateName(User user) {
	  long userId = user.getId();

	  try {
	    User u = udao.findById(userId).orElse(null);
	    if(u != null) {
	      u.setName(user.getName());
	      udao.save(u);
	      return "Name updated successfully";
	    }
	    else {
	      return "User not found";
	    }
	  }catch(Exception e) {
	    return e.toString();
	  }
	}

	@Override
	public String updateEmail(User user) {
	  long userId = user.getId();

	  try {
	    User u = udao.findById(userId).orElse(null);
	    if(u != null) {
	      u.setEmail(user.getEmail());
	      udao.save(u);
	      return "Email updated successfully";
	    }
	    else {
	      return "User not found";
	    }
	  }catch(Exception e) {
	    return e.toString();
	  }
	}

	
	

}
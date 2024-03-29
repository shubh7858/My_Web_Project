package com.cms.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.dto.LoginDto;
import com.cms.services.LoginService;

@CrossOrigin("*")
@RestController
@RequestMapping("/cms/auth")
public class AuthController {
	
	@Autowired
	private LoginService lser;

	@PostMapping("/login")
	public String login(@RequestBody LoginDto cred) {
		return lser.validateEmail(cred.getEmail());
	}
}
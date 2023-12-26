package com.cms.Controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/cms/auth")
public class AuthController {
    
	@GetMapping("/login")
	public String login() {
		return "This is login";
	}

}

package com.lcwd.mvc.SpringMvcProject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController 
{
	@RequestMapping("/login")
	public String showLoginPageHander()
	{
		System.out.println("login page");
	
	return "login";
	}

}

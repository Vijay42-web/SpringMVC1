package com.lcwd.mvc.SpringMvcProject.Controllers;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
@RequestMapping("api")
public class ApiController 
{
	@RequestMapping(value="/hello",method=RequestMethod.GET)
//	@ResponseBody
	public String helloApi()
	{
		return "";
	}
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<String> getUserData()
	{
		List<String> users = Arrays.asList("Ram","Shyam","Raju");
		
		return users;
	}
	
	@RequestMapping("/create-user")
//	@ResponseBody
	public String createUser()
	{
		System.out.println("process users");
		
		return "new user created !!";
	}
	
	@RequestMapping("/count")
	public void getcount()
	{
		System.out.println("count of users ");
		
	}
	@RequestMapping("/taraji")
	public void getTaraji()
	{
		System.out.println("return type not required");
		
		return ;
	}
	
	
}

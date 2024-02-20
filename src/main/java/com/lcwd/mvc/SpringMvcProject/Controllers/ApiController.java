package com.lcwd.mvc.SpringMvcProject.Controllers;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController 
{
	@RequestMapping(value="/hello",method=RequestMethod.GET)
//	@ResponseBody
	public String helloApi()
	{
		return "hello api is my first api ";
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
	
	
}

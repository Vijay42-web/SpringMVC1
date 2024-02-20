package com.lcwd.mvc.SpringMvcProject.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//@Component
//@RequestMapping("/Project")
@Controller
public class SuperMan 
{
	@RequestMapping("/about")
	public String aboutRequestHandler() 
	{
		System.out.println("processing about request");
		
		return "about";
	}

	@RequestMapping("/services")
	public String aboutServiceHandler() 
	{
		System.out.println("processing service request");
		
		return "services";
	}
	
	
	@RequestMapping("/backend")
	public String aboutbackendHandler() 
	{
		System.out.println("processing backend request");
		
		return "backend";
	}
}

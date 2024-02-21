package com.lcwd.mvc.SpringMvcProject.Controllers;

import java.util.Map;
import java.lang.String;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.mvc.SpringMvcProject.Model.Student;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@PostMapping("/create")
	public String createStudent(@RequestBody Student student)
	{
		System.out.println(student);
		
		return "created";
	}
	
	

}

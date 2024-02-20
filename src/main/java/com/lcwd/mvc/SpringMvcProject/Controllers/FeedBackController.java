package com.lcwd.mvc.SpringMvcProject.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class FeedBackController 

{
//	@RequestMapping(value="/feedback",method=RequestMethod.GET)
	@GetMapping("/feedback")
	public List<String> getFeedBacks()
	{
		List<String> feedback = Arrays.asList("Excellent code","Good one","Ordinary one");
		
		return feedback;
	}

	@PostMapping("/create-feedback")
	public String crateFeedBack()
	{
		System.out.println("new feedback created");
		
		return "feedback created !!";
	}
}

package com.lcwd.mvc.SpringMvcProject.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/Product")
public class ProductController 
{
	Logger logger = LoggerFactory.getLogger(ProductController.class);
	@GetMapping("/getProduct")
	public String getProduct(@RequestParam("productName")String name,
			                 @RequestParam(value="productId",defaultValue="0",required=false)String id,
			                 @RequestParam("productRating")String rating)
	{

	System.out.println("productName :- "+ name);
	System.out.println("productId :- "+ id);
	System.out.println("productRating :- "+ rating);
	
		return "This is product";
	}
	@RequestMapping("/checkProduct/{productName}/{productId}/{productRating}")
	public String checkProduct(@PathVariable ("productName") String name,
			                   @PathVariable ("productId") int id,
			                   @PathVariable("productRating")String rating )
	{
//		System.out.println("productName :- "+ name);
//		System.out.println("productId :- "+ id);
//		System.out.println("productRating :- "+ rating)
		
		logger.error("productName :- "+ name);
		logger.warn("productId :- "+ id);
		logger.info("productRating :- "+ rating);
		logger.debug("debugging");
		
		return "checking product";
	}
	
}


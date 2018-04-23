package com.consul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

	@Autowired
    private GreetingFeignService greetingFeignService;
	
	 @RequestMapping(value = "/get-greeting", method = RequestMethod.GET)
	    public String greeting() {
	       String greeting= greetingFeignService.greeting();
	       return greeting;
	    }
	 
	 
	 
}

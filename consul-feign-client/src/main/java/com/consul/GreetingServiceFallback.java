package com.consul;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceFallback implements GreetingFeignService{

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return "Hello from Fallback Service!";
	}

}

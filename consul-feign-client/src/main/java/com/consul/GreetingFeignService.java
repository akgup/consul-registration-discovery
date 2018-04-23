package com.consul;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="greeting-cloud-service", fallback=GreetingServiceFallback.class)
public interface GreetingFeignService {

	   @RequestMapping("/greeting")
	    String greeting();
	   
}

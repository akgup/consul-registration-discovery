package com.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConsulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulClientApplication.class, args);
	}
	
	
@RequestMapping("/greeting")
    public String greeting() {
        return "Hello from Greeting Service!";
    }
}

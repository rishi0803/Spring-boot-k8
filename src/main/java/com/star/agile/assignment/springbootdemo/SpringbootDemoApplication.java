package com.star.agile.assignment.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringbootDemoApplication {
    @GetMapping("/message")
    public String displayMessage(){
	  return "Congrulation you successfully deployed your application to kubernetes";  
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}

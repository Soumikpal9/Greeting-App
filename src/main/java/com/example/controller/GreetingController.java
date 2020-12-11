package com.example.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.GreetingService;
import com.example.user.Greeting;
import com.example.user.User;

@RestController
public class GreetingController {
	private static final String template = "'Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	public GreetingService greetingService;
	
	@GetMapping(value={"", "/", "/home"})
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		User user = new User();
		user.setFirstName(name);
		return greetingsService.addGreeting(user);
	}
	
	@PostMapping("/post")
	public Greeting greeting(@RequestBody User user) {
		return greetingService.addGreeting(user);
	}
}

package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.User;

@RestController
@RequestMapping("/hello")
public class Apis {
	
	@GetMapping("/first")
	//@RequestMapping(value={"/first"}, method=RequestMethod.GET)
	
	//Use Request Mapping for multiple paths
	public ResponseEntity<String> getFirstApi(){
		ResponseEntity<String> x = new ResponseEntity<String>("First Method", HttpStatus.OK);
		return x;
	}
	
	@RequestMapping(value = {"", "/", "/home"})
	public String sayHello() {
		return "Hello World!!!";
	}
	
	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value="name") String name) {
		return "Hello " + name + "!";
	}
	
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello " + name + "!";
	}
	
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		System.out.println(user);
		return "Hello " + user.getFirstName() + " " + user.getLastName() + "!"; 
	}
	
	@PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName, @RequestParam(value="lastName") String lastName) {
		return "Hello " + firstName + " " + lastName + "!";
	}
}

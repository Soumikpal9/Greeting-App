package com.example.service;

import com.example.user.Greeting;
import com.example.user.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}

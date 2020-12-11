package com.example.user;

import javax.persistence.Entity;

@Entity
@Table(name = "GREETINGS")
public class Greeting {
	private final long id;
	private final String message;
	
	public long getId() {
		return id;
	}
	public String getMessage() {
		return message;
	}
	public Greeting(long id, String message) {
		this.id = id;
		this.message = message;
	}
}

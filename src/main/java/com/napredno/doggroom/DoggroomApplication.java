package com.napredno.doggroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DoggroomApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoggroomApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello, World!";
	}
}
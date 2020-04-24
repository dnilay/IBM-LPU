package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.ImageRepo;

@SpringBootApplication
public class SpringBootDto1Application {
	
	private ImageRepo imageRepo;

	@Autowired
	public SpringBootDto1Application(ImageRepo imageRepo) {
		super();
		this.imageRepo = imageRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDto1Application.class, args);
	}

}

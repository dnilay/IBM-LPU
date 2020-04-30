package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class ConsulAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulAdminServerApplication.class, args);
	}

}

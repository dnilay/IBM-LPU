package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
//@GetMapping("/")
//@RequestMapping("/")
@RequestMapping(method = RequestMethod.GET)
public String home()
{
	return "spring boot is simple";
}
	
}

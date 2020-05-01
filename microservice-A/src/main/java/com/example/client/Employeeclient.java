package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.fallback.EmployeeFallback;

@FeignClient(value ="service-B", fallback = EmployeeFallback.class)
public interface Employeeclient {
	
	@RequestMapping("/api/employees/hi")
	
	public String callHi(@RequestParam String name);
	
}

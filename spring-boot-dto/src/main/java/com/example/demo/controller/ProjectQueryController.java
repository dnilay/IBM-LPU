package com.example.demo.controller;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Project;
import com.example.demo.service.ProjectQueryService;

@RestController
@RequestMapping("/api")
public class ProjectQueryController {


 private ProjectQueryService projectQueryService;

@Autowired
 public ProjectQueryController(ProjectQueryService projectQueryService) {
	super();
	this.projectQueryService = projectQueryService;
	
}

@GetMapping("/projects")
 public ResponseEntity<Object> getAllProjects() {
  return new ResponseEntity<>(projectQueryService.getAllProjects(), HttpStatus.OK);
 }

 @GetMapping("/projects/{id}")
 public ResponseEntity<Project> getProjectById(@PathVariable("id") Integer id){
  return new ResponseEntity(projectQueryService.getProject(id),HttpStatus.OK);
 }
}
package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Task;
import com.example.service.TaskService;

@RestController
@EnableAutoConfiguration
public class TaskController {

	private TaskService taskService;
	
	@Autowired
	public TaskController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}


	@GetMapping("/tasks")
	public ResponseEntity<Iterable<Task>> findAllTask()
	{
		return ResponseEntity.status(HttpStatus.OK).body(taskService.getALlTasks());
	}
}

package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.model.Task;

@Repository(value = "taskRepository")
@EnableTransactionManagement
public interface TaskRepository extends CrudRepository<Task, Integer> {

}

package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProjectQueryDTO;
import com.example.demo.entity.Project;
import com.example.demo.repo.ProjectRepository;

@Service
public class ProjectQueryServiceImpl implements ProjectQueryService {


 private ProjectRepository projectRepo;

 public ProjectQueryServiceImpl(ProjectRepository projectRepo) {
	super();
	this.projectRepo = projectRepo;
}

@Override
 public ProjectQueryDTO getProject(Integer id) {
  if (projectRepo.findById(id).isPresent()) {
   Project fetchProject = projectRepo.findById(id).get();
   ProjectQueryDTO dto=new ProjectQueryDTO(fetchProject.getName(), fetchProject.getDescription(),
		     fetchProject.getAgentName());
   return  dto;
  } else {
   return null;
  }
 }

 @Override
 public List<ProjectQueryDTO> getAllProjects() {
  List<ProjectQueryDTO> projectList = new ArrayList<>();
  projectRepo.findAll().forEach(project -> {
   projectList.add(new ProjectQueryDTO( project.getName(), project.getDescription(),
     project.getAgentName()));
  });

  return projectList;
 }

}

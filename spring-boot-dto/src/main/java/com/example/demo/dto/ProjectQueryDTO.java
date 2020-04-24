package com.example.demo.dto;
public class ProjectQueryDTO {

 private String name;
 private String description;
 private String agentName;

 public ProjectQueryDTO(String name, String description, String agentName) {

  this.name = name;
  this.description = description;
  this.agentName = agentName;
 }



 public String getDescription() {
  return description;
 }

 public String getAgentName() {
  return agentName;
 }



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



@Override
public String toString() {
	return "ProjectQueryDTO [name=" + name + ", description=" + description + ", agentName=" + agentName + "]";
}

 
}

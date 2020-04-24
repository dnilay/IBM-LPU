package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project_name")
public class Project {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String name;
 private String description;
 private String agentName;

 public Project() {
 }

 public Project(String name, String description, String agentName) {
	super();
	this.name = name;
	this.description = description;
	this.agentName = agentName;
}

public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public String getAgentName() {
  return agentName;
 }

 public void setAgentName(String agentName) {
  this.agentName = agentName;
 }

 @Override
 public String toString() {
  return "Project [id=" + id + ", name=" + name + ", description=" + description + ", agentName=" + agentName
    + "]";
 }

}
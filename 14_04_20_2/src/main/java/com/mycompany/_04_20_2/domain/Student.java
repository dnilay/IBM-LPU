package com.mycompany._04_20_2.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "student")
public class Student implements Serializable {
	private static final long serialVersionUID = -7209693288444782024L;
	@Id
	private String id;
	@Column(name="first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String email;
	
	

}

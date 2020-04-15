package com.mycompany._04_20_1.example;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Album {
	@Id
	private String albumID;
	@Column(name = "album_name")
	private String albumName;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "album")
	private Image image;

}

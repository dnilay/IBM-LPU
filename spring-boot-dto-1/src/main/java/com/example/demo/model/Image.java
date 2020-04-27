package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Data
public class Image {
	@Id
	@Column(name = "image_id")
	private String imageID;
	@Column(name = "image_url")
	private String imageURL;
	@Column(name = "available")
	@JsonProperty
	private boolean isAvailable;
	public Image() {
		super();
	}
	public Image(String imageID, String imageURL, boolean isAvailable) {
		super();
		this.imageID = imageID;
		this.imageURL = imageURL;
		this.isAvailable = isAvailable;
	}

}

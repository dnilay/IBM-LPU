package com.mycompany._04_20_1.example;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="image")
public class Image {

	@Id
	private String imageID;
	@Column(name = "image_url")
	private String imageURL;
	@Column(name = "is_available")
	private Boolean isAvailable;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="album_id")
	private Album album;
	@Override
	public String toString() {
		return "Image [imageID=" + imageID + ", imageURL=" + imageURL + ", isAvailable=" + isAvailable + ", album="
				+ album.getAlbumID() +", "+album.getAlbumName()+"]";
	}
	
		
}

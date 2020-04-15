package com.mycompany._04_20_1;

import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany._04_20_1.example.Album;
import com.mycompany._04_20_1.example.Image;

public class App {
	public static void main(String[] args) {
		try {

			SessionFactory factory = new Configuration().configure().addAnnotatedClass(Image.class)
					.addAnnotatedClass(Album.class).buildSessionFactory();
			Session session = factory.openSession();

			/*
			 * Album myAlbum = new Album();
			 * myAlbum.setAlbumID(UUID.randomUUID().toString());
			 * myAlbum.setAlbumName("Family Album"); Image image = new Image();
			 * image.setImageID(UUID.randomUUID().toString());
			 * image.setImageURL("demo url"); image.setIsAvailable(true);
			 * image.setAlbum(myAlbum); session.getTransaction().begin();
			 * session.save(image); session.getTransaction().commit();
			 * 
			 */
			 List<Image> list = session.createQuery("from Image", Image.class).list(); 
			//  System.out.println(list);
			
			  for (Image a : list) {
				  
				  
				 System.out.println(a);
			  }
			 // System.out.println(b);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

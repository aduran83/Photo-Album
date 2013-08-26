/**
 * 
 */
package com.duran.model;

import java.util.List;

/**
 * @author aeduran1
 *
 */
public class Album {
	private List<Photo> photos;
	private String name;
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
		

	

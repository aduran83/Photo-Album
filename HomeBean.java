package com.duran.web.pagecode;

import java.util.ArrayList;
import java.util.List;

import com.duran.model.Album;

/**
 * @author engel.evan
 *
 */
public class HomeBean
{
	private List<Album> albums;
	private String value;
	
	public HomeBean()
	{
		albums = new ArrayList<Album>();
		
		Album album = new Album();
		album.setName("Engagements Pics");
		albums.add(album);
		
		album = new Album();
		album.setName("Wedding");
		albums.add(album);
	}
	
	public String search()
	{	
		return "home";
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	/**
	 * @return the albums
	 */
	public List<Album> getAlbums() {
		return albums;
	}

	/**
	 * @param albums the albums to set
	 */
	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
}

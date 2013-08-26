/**
 * 
 */
package com.duran.model;

import java.util.Calendar;

/**
 * @author aeduran1
 *
 */
public class Photo {
	public static double BYTES_IN_MEGABYTE = 1048576;
	private String description;
	private String category;
	private String format; 
	private long size;//in bytes 
	private String color;
	private Calendar taken;
	private Calendar modify;
			
	// 1 megabyte equal 1 048 576 bytes. I want my bytes and convert into megabytes
	// Method of declaration
	public String sizeInMegabytes() {
		return String.valueOf(size/BYTES_IN_MEGABYTE) + " MB";
			
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Calendar getTaken() {
		return taken;
	}
	public void setTaken(Calendar taken) {
		this.taken = taken;
	}
	public Calendar getModify() {
		return modify;
	}
	public void setModify(Calendar modify) {
		this.modify = modify;
	}
	
	
}

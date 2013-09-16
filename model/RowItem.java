package com.example.test4_1.model;

/**
 * This class is used to store data for each item in listView
 */
public class RowItem {
	private int imageId;
	private String title;
	private String desc;
	
	public RowItem(int imageId, String title, String desc) {
		this.imageId = imageId;
		this.title = title;
		this.desc = desc;
	}
	
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString()
	{
		return title + "\n" + desc ;
	}
}

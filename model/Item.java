package com.example.test4_1.model;

public class Item {

	private int imageId;
	private String title;
	private String description;
	private String fullDesc;
	public Item(int imageId, String title, String description, String fullDesc) {
		super();
		this.imageId = imageId;
		this.title = title;
		this.description = description;
		this.fullDesc = fullDesc;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFullDesc() {
		return fullDesc;
	}
	public void setFullDesc(String fullDesc) {
		this.fullDesc = fullDesc;
	}
}

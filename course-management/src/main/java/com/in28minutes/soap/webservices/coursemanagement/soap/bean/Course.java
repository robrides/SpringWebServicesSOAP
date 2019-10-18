package com.in28minutes.soap.webservices.coursemanagement.soap.bean;

public class Course {

	private int id;
	private String name; 
	private String description;
	
	
	
	public Course() {
		super();
	}



	public Course(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
	
	
}

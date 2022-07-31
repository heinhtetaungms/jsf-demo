package com.ai;

public class Course {

	private String name;
	private String level;
	private String description;
	private int fees;
	
	public Course() {}
	
	public Course(String name, String level, String description, int fees) {
		super();
		this.name = name;
		this.level = level;
		this.description = description;
		this.fees = fees;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
}

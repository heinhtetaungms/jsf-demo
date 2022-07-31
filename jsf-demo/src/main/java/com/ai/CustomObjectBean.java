package com.ai;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;

@Model
public class CustomObjectBean {

	private Course course;
	
	@PostConstruct
	private void init() {
		course = new Course();
		course.setName("Java SE");
		course.setLevel("Basic");
		course.setDescription("Basic Course");
		course.setFees(150000);
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}

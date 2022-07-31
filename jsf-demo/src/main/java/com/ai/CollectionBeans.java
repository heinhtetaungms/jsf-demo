package com.ai;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;

@Model
public class CollectionBeans {
	
	private List<Course> list;
	
	@PostConstruct
	private void init() {
		list = new ArrayList<>();
		list.add(new Course("JavaSE", "Basic", "Basic Course", 150000));
		list.add(new Course("JavaEE", "Advance", "Advance Java EE Course", 200000));
		list.add(new Course("Spring", "Advance", "Advance Spring Course", 200000));
		list.add(new Course("Flutter", "Intermediate", "Mobile Course", 150000));

	}

	public List<Course> getList() {
		return list;
	}

	public void setList(List<Course> list) {
		this.list = list;
	}
	
	
}

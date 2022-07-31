package com.ai;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;

@Model
public class ButtonsModel {
	
	private String param1;
	private String param2;
	
	@PostConstruct
	private void init() {
		param1 = FacesContext
				.getCurrentInstance().getExternalContext()
				.getRequestParameterMap()
				.get("param1");
	
		param2 = FacesContext
				.getCurrentInstance().getExternalContext()
				.getRequestParameterMap()
				.get("param2");
	
	}
	
	public String getParam1() {
		return param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	public String getParam2() {
		return param2;
	}
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	
	
}

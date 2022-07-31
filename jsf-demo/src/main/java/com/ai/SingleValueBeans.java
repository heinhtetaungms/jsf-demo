package com.ai;

import java.time.DayOfWeek;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;

@Model
public class SingleValueBeans {
	
	private String value1;
	private int value2;
	private double value3;
	private Date value4;
	private DayOfWeek value5;
	
	@PostConstruct
	public void postConstruct() {
		value1 = "Hello JSF";
		value2 = 100;
		value3 = Math.PI;
		value4 = new Date();
		value5 = DayOfWeek.MONDAY;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}

	public double getValue3() {
		return value3;
	}

	public void setValue3(double value3) {
		this.value3 = value3;
	}

	public Date getValue4() {
		return value4;
	}

	public void setValue4(Date value4) {
		this.value4 = value4;
	}

	public DayOfWeek getValue5() {
		return value5;
	}

	public void setValue5(DayOfWeek value5) {
		this.value5 = value5;
	}
	
	
}

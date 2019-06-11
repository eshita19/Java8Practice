package com.java8.lambda;

public class Student {
	private int rollNum;
	private String name;

	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Student(int rollNum, String name){
		this.rollNum = rollNum;
		this.name = name;
	}
}

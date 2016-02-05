package com.epam.spring.core;

public class Client {
	private int id;
	private String fullName;
	
	public Client(Integer i, String string) {
		id = i;
		fullName = string;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}

package com.epam.spring.core;

import java.text.DateFormat;
import java.util.Date;

public class Event {
	private static int counterId = 0;
	private int id = counterId++;
	private String message;
	private Date date;
	private DateFormat df;

	public Event(Date date, DateFormat df) {
		super();
		this.date = date;
		this.df = df;
	}

	@Override
	public String toString() {
		return "Event [id=" + id 
				+ ", message=" + message 
				+ ", date=" + df.format(date) + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

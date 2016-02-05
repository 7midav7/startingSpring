package com.epam.spring.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileEventLogger implements EventLogger{
	private String filename;
	
	public FileEventLogger(String filename){
		this.filename = filename;
	}
	
	public void init(String filename){
		File file = new File(filename);
	}

	@Override
	public void logEvent(Event event) {
		try {
			FileUtils.writeStringToFile(new File(filename), event.getMessage(), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

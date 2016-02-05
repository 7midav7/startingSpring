package com.epam.spring.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileEventLogger implements EventLogger{
	private String filename;
	
	public FileEventLogger(String filename){
		this.filename = filename;
	}
	
	private void init() throws IOException{
		File file = new File(filename);
		if (!file.exists()){
			throw new FileNotFoundException();
		}
	}

	@Override
	public void logEvent(Event event) {
		try {
			FileUtils.writeStringToFile(new File(filename), event.getMessage() + " message \n", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.epam.spring.core;

import java.util.List;

public class CacheFileEventLogger extends FileEventLogger {
	private int cacheSize;
	private List<Event> cache;
	
	public CacheFileEventLogger(String filename, Integer cacheSize){
		super(filename);
		this.cacheSize = cacheSize;
	}
	
	public CacheFileEventLogger(String filename) {
		super(filename);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void logEvent(Event event){
		cache.add(event);
		
		if (cache.size() == cacheSize){
			writeEventsFromCache();
			cache.clear();
		}
	}
	
	private void writeEventsFromCache(){
	}

}

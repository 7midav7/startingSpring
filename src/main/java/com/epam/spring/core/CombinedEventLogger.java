package com.epam.spring.core;

import java.util.List;

public class CombinedEventLogger implements EventLogger{
	private List<EventLogger> loggers;

	CombinedEventLogger(List<EventLogger> loggers){
		this.loggers = loggers;
	}
	
	@Override
	public void logEvent(Event event) {
		for (EventLogger logger : loggers){
			if (event.getType() == null && logger.getClass() == CacheFileEventLogger.class){
				 logger.logEvent(event);
			}
			if (event.getType() == Event.EventType.ERROR){
				logger.logEvent(event);
			}
			if (event.getType() == Event.EventType.INFO && logger.getClass() == ConsoleEventLogger.class){
				logger.logEvent(event);
			}			
		}
	}

}

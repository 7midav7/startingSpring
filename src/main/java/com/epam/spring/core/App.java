package com.epam.spring.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	private Client client;
	private EventLogger logger;
	
	public App(Client client, EventLogger logger){
		this.client = client;
		this.logger = logger;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public EventLogger getLogger() {
		return logger;
	}

	public void setLogger(EventLogger logger) {
		this.logger = logger;
	}
	
    public static void main( String[] args )
    {    
    	ConfigurableApplicationContext ctx = 
    			new ClassPathXmlApplicationContext("spring.xml");
    	App app = (App) ctx.getBean("app");
        //app.logEvent("some event " + app.client.getId());
    	Event event1 = (Event) ctx.getBean("event");
    	Event event2 = (Event) ctx.getBean("event");
    	Event event3 = (Event) ctx.getBean("event");
    	Event event4 = (Event) ctx.getBean("event");
    	Event event5 = (Event) ctx.getBean("event");
    	Event event6 = (Event) ctx.getBean("event");
    	Event event7 = (Event) ctx.getBean("event");
    	app.logEvent(event1);
    	app.logEvent(event2);
    	app.logEvent(event3);
    	app.logEvent(event4);
    	app.logEvent(event5);
    	app.logEvent(event6);
    	app.logEvent(event7);
    	ctx.close();
    }
    
    public void logEvent(Event event){
    	logger.logEvent(event);
    }
}

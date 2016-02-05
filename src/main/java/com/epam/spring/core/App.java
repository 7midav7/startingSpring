package com.epam.spring.core;

import org.springframework.context.ApplicationContext;
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
    	ApplicationContext ctx = 
    			new ClassPathXmlApplicationContext("spring.xml");
    	App app = (App) ctx.getBean("app");
        //app.logEvent("some event " + app.client.getId());
    	Event event1 = (Event) ctx.getBean("event");
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Event event2 = (Event) ctx.getBean("event");
    	app.logEvent(event1);
    	app.logEvent(event2);
    }
    
    public void logEvent(Event event){
    	logger.logEvent(event);
    }
}

package com.rndayala.jms.basics;

import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;

public class JMSContextDemo {

	public static void main(String[] args) throws NamingException {
		/*
		 * JMS clients use property files to create a JNDI IntialContextFactory. 
		 * If you put the JNDI configuration in the jndi.properties file and place this file on your class path, 
		 * you can access the InitialContext and you can search/lookup for the ConnectionFactory objects and destinations.
		 */
		InitialContext initialContext = new InitialContext();
		
		// lookup for Destination from InitialContext
		Queue queue = (Queue) initialContext.lookup("queue/myQueue");
		
		// We can create the resources in try-with-resources block, they are AutoCloseable.
		// JMSContext clubs Connection + Session
		try (ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory(); 
				JMSContext jmsContext = cf.createContext()) {
			jmsContext.createProducer().send(queue, "New Student Registered");
			String mesg = jmsContext.createConsumer(queue).receiveBody(String.class);
			
			System.out.println("Message Received : " + mesg);
		}
	}

}

package com.rndayala.jms.basics;

import java.util.Enumeration;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueBrowser;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class QueueBrowserDemo {

	public static void main(String[] args) {

		InitialContext initialContext = null;
		Connection connection = null;
		
		try {
			/*
			 * JMS clients use property files to create a JNDI IntialContextFactory. 
			 * If you put the JNDI configuration in the jndi.properties file and place this file on your class path, 
			 * you can access the InitialContext and you can search/lookup for the ConnectionFactory objects and destinations.
			 */
			initialContext = new InitialContext();
			
			// lookup for Destination from InitialContext
			Queue queue = (Queue) initialContext.lookup("queue/myQueue");
			
			// lookup for ConnectionFactory from InitialContext
			ConnectionFactory cf = (ConnectionFactory) initialContext.lookup("ConnectionFactory");
			
			// From connection factory, create a Connection
			connection = cf.createConnection();
			
			// From connection, create a Session
			Session session = connection.createSession();

			// Using session, create a MessageProducer that will send message to Destination (Queue)
			MessageProducer producer = session.createProducer(queue);
			
			// The message sent to the queue is stored in the queue. 
			// So, you can send messages to queue even if no consumer is running.
			TextMessage message = session.createTextMessage("Message A");
			producer.send(message);
			System.out.println("Message sent :" + message.getText());
			
			message = session.createTextMessage("Message B");
			producer.send(message);
			System.out.println("Message sent :" + message.getText());
			
			// QueueBrowser can be used to view the Queue, without consuming the messages
			QueueBrowser browser = session.createBrowser(queue);
			Enumeration messagesEnum = browser.getEnumeration();
			
			while (messagesEnum.hasMoreElements()) {
				TextMessage mesg = (TextMessage) messagesEnum.nextElement();
				System.out.println("Message in Queue : " + mesg.getText());
			}
			
			// Using session, create a MessageConsumer which will read/receive message from Destination (Queue)
			MessageConsumer consumer = session.createConsumer(queue);
			connection.start();
			
			// Then when your Consumer application runs the queueConsumer receives the message sent to the queue.
			TextMessage messageReceived = (TextMessage) consumer.receive(5000);
			System.out.println("Message received : " + messageReceived.getText()); // Message A
			
			messageReceived = (TextMessage) consumer.receive(5000);
			System.out.println("Message received : " + messageReceived.getText()); // Message B
			
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (JMSException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}
			if (initialContext != null) {
				try {
					initialContext.close();
				} catch (NamingException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

package com.rndayala.jms.basics;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class FirstTopic {

	public static void main(String[] args) {
		InitialContext initialContext = null;
		Connection connection = null;

		try {
			/*
			 * JMS clients use property files to create a JNDI IntialContextFactory. If you
			 * put the JNDI configuration in the jndi.properties file and place this file on
			 * your class path, you can access the InitialContext and you can search/lookup
			 * for the ConnectionFactory objects and destinations.
			 */
			initialContext = new InitialContext();

			// lookup for Destination from InitialContext
			Topic topic = (Topic) initialContext.lookup("topic/myTopic");
			
			// lookup for ConnectionFactory from InitialContext
			ConnectionFactory cf = (ConnectionFactory) initialContext.lookup("ConnectionFactory");

			// From connection factory, create a Connection
			connection = cf.createConnection();

			// From connection, create a Session
			Session session = connection.createSession();

			// Using session, create a MessageProducer that will send message to Destination (Topic)
			MessageProducer producer = session.createProducer(topic);

			// Using session, create a MessageConsumer which will read/receive message from Destination (Topic)
			MessageConsumer consumer1 = session.createConsumer(topic);
			MessageConsumer consumer2 = session.createConsumer(topic);

			connection.start();

			// The messages sent to the topic is discarded if there are no subscribers to
			// receive the message. So, start the subscribers before producer sending the message.
			
			// Now that subscribers are already waiting for topic, send the message
			TextMessage message = session.createTextMessage("New blog post published!!");
			producer.send(message);
			System.out.println("Message sent : " + message.getText());

			// Multiple subscribers can receive the message
			TextMessage messageReceived1 = (TextMessage) consumer1.receive(5000);
			System.out.println("Message received : " + messageReceived1.getText());

			TextMessage messageReceived2 = (TextMessage) consumer2.receive(5000);
			System.out.println("Message received : " + messageReceived2.getText());

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

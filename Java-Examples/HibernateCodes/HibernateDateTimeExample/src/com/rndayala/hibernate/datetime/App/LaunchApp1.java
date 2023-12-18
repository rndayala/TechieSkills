package com.rndayala.hibernate.datetime.App;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rndayala.hibernate.datetime.entity.Implementers;

public class LaunchApp1 {

	public static void main(String[] args) 
	{
		// Inform JVM to activate Hibernate
		Configuration config = new Configuration();
		config.configure(); // uses the default configuration file hibernate.cfg.xml
		
		// in case we haven't provided the mapping class in hibernate.cfg.xml file
		config.addAnnotatedClass(Implementers.class);

		// Creating SessionFactory to hold all other required objects for Hibernate
		SessionFactory sessionFactory = config.buildSessionFactory();

		// Start with Persistence operations
		Session session = sessionFactory.openSession();

		// For non-SELECT operation, we need to use transaction
		Transaction transaction = session.beginTransaction();

		// create the object
		Implementers imp = new Implementers();
		imp.setId(2);
		imp.setName("Rajesh");
		imp.setDate(new Date());
		imp.setTime(new Date());
		imp.setDateAndTime(new Date());

		// Perform persistence operation
		session.save(imp);
		
		// commit the transaction
		transaction.commit();
		
		Implementers imp1 = session.get(Implementers.class, 2);
		System.out.println(imp1);

		// Close the resources
		session.close();
		sessionFactory.close();	
	}
}
package com.rndayala.hibernate.retrievedata.App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rndayala.hibernate.retrievedata.entity.Student;

public class LaunchAppEager {

	public static void main(String[] args) 
	{
		// Inform JVM to activate Hibernate
		Configuration config = new Configuration();
		config.configure(); // uses the default configuration file hibernate.cfg.xml

		// Creating SessionFactory to hold all other required objects for Hibernate
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		System.out.println("Name of class implementing session factory : " + sessionFactory.getClass());

		// Start with Persistence operations
		Session session = sessionFactory.openSession();

		// For SELECT operation, no need of transaction - comment below line
		// Transaction transaction = session.beginTransaction();

		// Perform persistence operation
		Student st1 = session.get(Student.class,  1);
		System.out.println("Student details : " + st1);
		
		// if we try to get same object again, Hibernate will not generate SQL query again
		Student st2 = session.get(Student.class,  1);
		System.out.println("Student details : " + st2);
		

		// Close the resources
		session.close();
		sessionFactory.close();
	}

}

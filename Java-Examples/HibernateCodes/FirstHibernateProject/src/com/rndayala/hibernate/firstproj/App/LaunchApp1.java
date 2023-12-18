package com.rndayala.hibernate.firstproj.App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rndayala.hibernate.firstproj.entity.Student;

public class LaunchApp1 {

	public static void main(String[] args) 
	{
		// Inform JVM to activate Hibernate
		Configuration config = new Configuration();
		config.configure(); // uses the default configuration file hibernate.cfg.xml
		
		// Creating SessionFactory to hold all other required objects for Hibernate
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		// Start with Persistence operations
		Session session = sessionFactory.openSession();
		
		// Only for non-SELECT operation, transaction must be there
		Transaction transaction = session.beginTransaction();
		
		// Create Persistence object
		Student st = new Student();
		st.setId(2);
		st.setName("Rajesh");
		st.setAge(41);
		st.setCity("Bangalore");
		
		// Perform persistence operation
		session.saveOrUpdate(st);
		
		// Commit the transaction
		transaction.commit();
		
		// Close the resources
		session.close();
		sessionFactory.close();
	}
}

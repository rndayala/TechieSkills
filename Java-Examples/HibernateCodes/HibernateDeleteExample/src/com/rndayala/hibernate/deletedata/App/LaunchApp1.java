package com.rndayala.hibernate.deletedata.App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rndayala.hibernate.deletedata.Entity.Student;

public class LaunchApp1 {

	public static void main(String[] args) {
		// Inform JVM to activate Hibernate
		Configuration config = new Configuration();
		config.configure(); // uses the default configuration file hibernate.cfg.xml

		// Creating SessionFactory to hold all other required objects for Hibernate
		SessionFactory sessionFactory = config.buildSessionFactory();

		// Start with Persistence operations
		Session session = sessionFactory.openSession();

		// first get the data and if it is available, delete it
		Student st = session.get(Student.class, 2);
		System.out.println(st);
		
		if (st != null) {
			// For non-SELECT operation, we need to use transaction
			Transaction transaction = session.beginTransaction();
			
			// Perform persistence operation
			session.delete(st);
		
			// Commit the transaction
			transaction.commit();
			
			System.out.println("Student deleted.");
			
		} else {
			System.out.println("Record not available");
		}
		
		// Close the resources
		session.close();
		sessionFactory.close();
	}
}

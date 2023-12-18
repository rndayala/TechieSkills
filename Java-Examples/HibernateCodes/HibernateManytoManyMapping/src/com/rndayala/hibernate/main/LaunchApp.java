package com.rndayala.hibernate.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rndayala.hibernate.entity.Course;
import com.rndayala.hibernate.entity.Student;
import com.rndayala.hibernate.util.HibernateUtility;

public class LaunchApp {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			System.out.println("before calling getsession");
			// session = new Configuration().configure().buildSessionFactory().openSession();
			
			session = HibernateUtility.getSession();
			System.out.println("after calling session ");
			if (session != null) {
				transaction = session.beginTransaction();
				if (transaction != null) {
					Course c1 = new Course(1, "Java", 14000);
					Course c2 = new Course(2, "Spring", 10000);
					Course c3 = new Course(3, "Hibernate", 5000);
					
					Set<Course> beginnerSet = new HashSet();
					beginnerSet.add(c1);
					beginnerSet.add(c2);
					
					Set<Course> advancedSet = new HashSet();
					advancedSet.add(c1);
					advancedSet.add(c2);
					advancedSet.add(c3);
					
					Student s1 = new Student("Rohan", "Pune", beginnerSet);
					Student s2 = new Student("Raghu", "Hyderbad", advancedSet);
					
					session.save(s1);
					session.save(s2);					
					
					flag = true;
				} else {
					System.out.println("Transaction object is not created!!");
				}
			} else {
				System.out.println("Session object is not created");
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Data is saved.");
				
				Student std = session.get(Student.class,  1);
				System.out.println(std);
			} else {
				transaction.rollback();
				System.out.println("Unable to save data.");
			}
			HibernateUtility.closeSession(session);
			HibernateUtility.closeSessionFactory();
		}
	}

}

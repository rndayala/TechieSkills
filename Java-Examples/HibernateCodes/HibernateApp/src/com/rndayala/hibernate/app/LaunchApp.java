package com.rndayala.hibernate.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rndayala.hibernate.entity.StudentInfo;
import com.rndayala.hibernate.util.HibernateUtility;

public class LaunchApp {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			session = HibernateUtility.getSession();
			if (session != null) {
				transaction = session.beginTransaction();
				if (transaction != null) {
					StudentInfo st = new StudentInfo();
					st.setId(1);
					st.setName("Raghu");
					st.setAge(42);
					st.setCity("Hyderabad");
					
					session.save(st);
					
					flag = true;
				}
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Data is saved.");
			} else {
				transaction.rollback();
				System.out.println("Unable to save data.");
			}
			HibernateUtility.closeSession(session);
			HibernateUtility.closeSessionFactory();
		}
	}
}

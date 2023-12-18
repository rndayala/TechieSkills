package com.rndayala.hibernate.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rndayala.hibernate.entity.Account;
import com.rndayala.hibernate.entity.Employee;
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
					Account acc = new Account();
					acc.setAccNo("T1234");
					acc.setAccType("Savings");
					acc.setName("Raghu");
					
					Employee emp = new Employee();
					emp.setName("Raghu");
					emp.setCity("Hyderabad");
					emp.setSalary(10000.00);
					emp.setAccount(acc);
					
					session.save(emp);
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
				
				Employee e = session.get(Employee.class,  1);
				System.out.println(e);
			} else {
				transaction.rollback();
				System.out.println("Unable to save data.");
			}
			HibernateUtility.closeSession(session);
			HibernateUtility.closeSessionFactory();
		}
	}
}


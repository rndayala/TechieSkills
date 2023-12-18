package com.rndayala.hibernate.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rndayala.hibernate.entity.Account;
import com.rndayala.hibernate.entity.Department;
import com.rndayala.hibernate.entity.Employee;
import com.rndayala.hibernate.util.HibernateUtility;

public class LaunchOnetoManyApp {

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
					Account acc1 = new Account();
					acc1.setAccNo("T1234");
					acc1.setAccType("Savings");
					acc1.setName("Raghu");
					
					Account acc2 = new Account();
					acc2.setAccNo("T1235");
					acc2.setAccType("Savings");
					acc2.setName("Rajesh");
					
					Employee emp1 = new Employee("Raghu", "Hyderabad", 10000.00, acc1);
					Employee emp2 = new Employee("Rajesh", "Bangalore", 5000.00, acc2);
					
					Set<Employee> empSet = new HashSet<>();
					empSet.add(emp1);
					empSet.add(emp2);
					
					Department dept1 = new Department();
					dept1.setDeptId("101");
					dept1.setDeptName("Java Implementers");
					dept1.setEmp(empSet);
					
					session.save(dept1);
					
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
				
				Department dept = session.get(Department.class,  "101");
				System.out.println(dept);
			} else {
				transaction.rollback();
				System.out.println("Unable to save data.");
			}
			HibernateUtility.closeSession(session);
			HibernateUtility.closeSessionFactory();
		}
	}
}


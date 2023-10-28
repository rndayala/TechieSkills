package com.rndayala.factory;

import com.rndayala.dao.StudentDAO;
import com.rndayala.dao.StudentDAOImpl;

public class StudentDAOFactory {
	private static StudentDAO studentDAO;
	
	static {
		studentDAO = new StudentDAOImpl();
	}
	
	public static StudentDAO getStudentDAO() {
		return studentDAO;
	}

}

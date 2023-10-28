package com.rndayala.service;

import com.rndayala.beans.Student;
import com.rndayala.dao.StudentDAO;
import com.rndayala.factory.StudentDAOFactory;

public class StudentServiceImpl implements StudentService {

	@Override
	public String addStudent(Student std) {
		StudentDAO studentDAO = StudentDAOFactory.getStudentDAO();
		String status = studentDAO.add(std);
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
		StudentDAO studentDAO = StudentDAOFactory.getStudentDAO();
		Student std = studentDAO.search(sid);
		return std;
	}

	@Override
	public String updateStudent(Student std) {
		StudentDAO studentDAO = StudentDAOFactory.getStudentDAO();
		String status = studentDAO.update(std);
		return status;
	}

	@Override
	public String deleteStudent(String sid) {
		StudentDAO studentDAO = StudentDAOFactory.getStudentDAO();
		String status = studentDAO.delete(sid);
		return status;
	}

}

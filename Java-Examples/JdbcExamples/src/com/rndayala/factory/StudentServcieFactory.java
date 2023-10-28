package com.rndayala.factory;

import com.rndayala.service.StudentService;
import com.rndayala.service.StudentServiceImpl;

public class StudentServcieFactory {
	private static StudentService studentService;
	
	static {
		studentService = new StudentServiceImpl();
	}
	
	public static StudentService getStudentService() {
		return studentService;
	}
}

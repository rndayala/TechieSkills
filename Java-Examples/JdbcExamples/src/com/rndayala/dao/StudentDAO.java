package com.rndayala.dao;

import com.rndayala.beans.Student;

public interface StudentDAO {
	public String add(Student std);
	public Student search(String sid);
	public String update(Student std);
	public String delete(String sid);
}

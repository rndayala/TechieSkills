package com.rndayala.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.rndayala.beans.Student;
import com.rndayala.factory.ConnectionFactory;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public String add(Student std) {
		String status = "";
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student where SID = '" + std.getSid() + "'");
			boolean b = rs.next();
			if ( b == true) {
				System.out.println("Student ID already exists!");
			} else {
				// Student not exist in table
				int rowCount = st.executeUpdate("insert into student values('" + std.getSid() + "', '" + std.getSname() + "', '" + std.getSaddr() + "')");
				if (rowCount == 1) {
					status = "Student insertion success!!";
				} else {
					status = "Student insertion failed!!";
				}
			}
		} catch(Exception e) {
			status = "Student insertion failed with exception!!";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Student search(String sid) {
		Student std = null;
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student where SID = '" + sid + "'");
			boolean b = rs.next();
			
			if (b == true) {
				// student exists
				std = new Student();
				std.setSid(rs.getString("SID"));
				std.setSname(rs.getString("SNAME"));
				std.setSaddr(rs.getString("SADDR"));
			} else {
				// student doesn't exist
				std = null;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return std;
	}

	@Override
	public String update(Student std) {
		String status = "";
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			int rowCount = st.executeUpdate("update student set SNAME = '" + std.getSname() + "', SADDR = '" + std.getSaddr() + "' where SID = '" + std.getSid() +"'");
			if (rowCount == 1) {
				status = "Student updation Success!!";
			} else {
				status = "Student updation Failed.";
			}
			
		} catch(Exception e) {
			status = "Student updation failed with exception!!";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String delete(String sid) {
		String status = "";
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			int rowCount = st.executeUpdate("delete from student where SID = '" + sid +"'");
			if (rowCount == 1) {
				status = "Student deletion Success!!";
			} else {
				status = "Student deletion Failed.";
			}
			
		} catch(Exception e) {
			status = "Student deletion failed with exception!!";
			e.printStackTrace();
		}
		return status;
	}

}

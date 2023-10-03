package com.rndayala.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcSelectQueryResultSetExample {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		ResultSet resultSet = null;

		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String username = "scott";
		String password = "tiger";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(jdbcUrl, username, password);
			st = con.createStatement();

			String sqlQuery = "select * from employee";
			resultSet = st.executeQuery(sqlQuery);

			// Process and print the results
			while (resultSet.next()) {
				int empId = resultSet.getInt("eno");
				String empName = resultSet.getString("ename");
				float empSal = resultSet.getFloat("esal");
				String empAddr = resultSet.getString("eaddr");
				// Add more columns as needed

				System.out.println("Employee ID: " + empId);
				System.out.println("Employee Name: " + empName);
				System.out.println("Employee Salary: " + empSal);
				System.out.println("Employee Address: " + empAddr);
				// Print more columns as needed
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close the resources
			try {
				resultSet.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

package com.rndayala.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectQuery {

	public static void main(String[] args) {

		// Define the database connection parameters
		// Replace with your Oracle Express Edition connection URL
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String username = "scott";
		String password = "tiger";

		try {
			// Step 1: Load and Register the Oracle JDBC driver
			Class.forName("oracle.jdbc.OracleDriver");

			// Step 2: Establish a connection to the database
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

			// Step 3: Create a statement for executing SQL queries
			Statement statement = connection.createStatement();

			// Step 4: Define the SQL query
			String sqlQuery = "SELECT empno, ename FROM emp";

			// Step 5: Execute the SQL query
			ResultSet resultSet = statement.executeQuery(sqlQuery);

			// Step 6: Process and print the results
			while (resultSet.next()) {
				int empId = resultSet.getInt("empno");
				String empName = resultSet.getString("ename");
				// Add more columns as needed

				System.out.println("Employee ID: " + empId);
				System.out.println("Employee Name: " + empName);
				// Print more columns as needed
				System.out.println();
			}

			// Step 7: Close resources
			resultSet.close();
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			System.err.println("Oracle JDBC driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Database connection error");
			e.printStackTrace();
		}

	}
}

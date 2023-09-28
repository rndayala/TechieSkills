package com.rndayala.jdbc.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreateTable {

	public static void main(String[] args) throws IOException {
		
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
			
			// Read table name from user
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter table name : ");
			String tableName = br.readLine();

			// Step 4: Define the SQL query
			String sqlQuery = "create table " + tableName + "(ENO number(5) PRIMARY KEY, ENAME varchar2(100), ESAL float(5), EADDR varchar2(100))";

			// Step 5: Execute the SQL query
			statement.executeUpdate(sqlQuery);
			
			System.out.println("Table " + tableName + " is created successfully!!");

			// Step 7: Close resources
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

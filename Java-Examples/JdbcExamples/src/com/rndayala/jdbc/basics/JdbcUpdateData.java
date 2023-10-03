package com.rndayala.jdbc.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcUpdateData {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		Scanner scanner = null;
		
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String username = "scott";
		String password = "tiger";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(jdbcUrl, username, password);			
			st = con.createStatement();
			scanner =  new Scanner(System.in);
			
			System.out.print("Enter Bonus Amount : ");
			int bonus = scanner.nextInt();
			
			System.out.print("Enter Salary Range : ");
			float salRange = scanner.nextFloat();
			
			String sqlQuery = "update employee set ESAL = ESAL + " + bonus + " where ESAL < " + salRange; 
			int rowCount = st.executeUpdate(sqlQuery);
			
			System.out.println("Employees Updated : " + rowCount);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close the resources
			scanner.close();
			
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

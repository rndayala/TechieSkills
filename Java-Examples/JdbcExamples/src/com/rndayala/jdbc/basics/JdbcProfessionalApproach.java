package com.rndayala.jdbc.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// In the professional approach, we declare all the resources before try block.
// We create the resources inside try block.
// We close the resources in the finally block.

public class JdbcProfessionalApproach {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		BufferedReader br = null;
		
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String username = "scott";
		String password = "tiger";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(jdbcUrl, username, password);			
			st = con.createStatement();
			br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.print("Employee Number : ");
				int eno = Integer.parseInt(br.readLine());
				
				System.out.print("Employee Name : ");
				String ename = br.readLine();
				
				System.out.print("Employee Salary : ");
				float esal = Float.parseFloat(br.readLine());
				
				System.out.print("Employee Address : ");				
				String eaddr = br.readLine();
				
				String sqlQuery = "insert into employee values(" + eno + ", '" + ename + "', " + esal + ", '" + eaddr + "')";
				System.out.println("Query : " + sqlQuery);
				
				int rowCount = st.executeUpdate(sqlQuery);
				
				if (rowCount == 1) {
					System.out.println("Employee details inserted successfully!!");
				}
				
				System.out.print("One more Employee[Yes/No]? :");
				String option = br.readLine();
				
				if(option.equalsIgnoreCase("yes")) {
					continue;
				} else {
					break;
				}
			}
			
			System.out.println("Insertion of values is Complete!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close the resources
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

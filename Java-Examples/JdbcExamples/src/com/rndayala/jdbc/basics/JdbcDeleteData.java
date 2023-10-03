package com.rndayala.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDeleteData {

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
			scanner = new Scanner(System.in);

			System.out.print("Enter Salary Range : ");
			float salRange = scanner.nextFloat();

			String sqlQuery = "DELETE FROM employee WHERE ESAL < " + salRange;
			int rowCount = st.executeUpdate(sqlQuery);

			System.out.println("No of Employees Deleted : " + rowCount);

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

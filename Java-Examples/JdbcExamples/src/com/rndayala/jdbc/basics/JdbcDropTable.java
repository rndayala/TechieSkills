package com.rndayala.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDropTable {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;

		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String username = "scott";
		String password = "tiger";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(jdbcUrl, username, password);
			st = con.createStatement();

			String sqlQuery = "DROP TABLE employee ";
			int result = st.executeUpdate(sqlQuery);
			
			if (result == 0) {
				System.out.println("Table dropped successfully!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

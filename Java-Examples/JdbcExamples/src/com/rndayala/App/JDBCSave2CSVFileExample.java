package com.rndayala.App;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSave2CSVFileExample {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		FileOutputStream fos = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xepdb1", "scott", "tiger");
			st = con.createStatement();
			rs = st.executeQuery("select * from employee");
			String data = "";
			data = data + "ENO,ENAME,ESAL,EADDR\n";
			
			while (rs.next()) {
				
				data = data + rs.getInt("ENO") + ",";
				data = data + rs.getString("ENAME") + ",";
				data = data + rs.getFloat("ESAL") + ",";
				data = data + rs.getString("EADDR") + "\n";
			}
			
			// write to files
			fos = new FileOutputStream("D:\\AGitRepo-RNDAYALA\\Java-Examples\\emp.txt");
			byte[] b = data.getBytes();
			
			fos.write(b);
			System.out.println("Data tranferred to CSV file");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				rs.close();
				st.close();
				con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

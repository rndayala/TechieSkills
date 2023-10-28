package com.rndayala.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.rndayala.beans.Student;
import com.rndayala.factory.StudentServcieFactory;
import com.rndayala.service.StudentService;

public class LaunchApp {

	public static void main(String[] args) {
		try {
			System.out.println("=========================================");
			System.out.println("     Welcome to Student Application     ");
			System.out.println("=========================================");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println();
				System.out.println("List of Options available : ");
				System.out.println("1. ADD");
				System.out.println("2. SEARCH");
				System.out.println("3. UPDATE");
				System.out.println("4. DELETE");
				System.out.println("5. EXIT");
				
				System.out.println("Your Option [1, 2, 3, 4, 5] : ");
				int option = Integer.parseInt(br.readLine());
				
				String sid = "", sname = "", saddr = "";
				String status = "";
				// from controller layer, we need to call service layer method
				StudentService studentService = StudentServcieFactory.getStudentService();
				Student std = null;
				
				switch (option) {
				case 1: {
					System.out.print("Student Id       : ");
					sid = br.readLine();
					sid = sid.toUpperCase();
					System.out.print("Student Name     : ");
					sname = br.readLine();
					System.out.print("Student Address  : ");
					saddr = br.readLine();
					std = new Student();
					std.setSid(sid);
					std.setSname(sname);
					std.setSaddr(saddr);
					
					status = studentService.addStudent(std);
					
					System.out.println("Status : " + status);
					
					break;
				}
				case 2:
					System.out.println("Student ID : ");
					sid = br.readLine();
					sid = sid.toUpperCase();
					std = studentService.searchStudent(sid);
					
					if ( std == null ) {
						System.out.println("Student doesn't exist!!");
					} else {
						System.out.println("Student details : ");
						System.out.println("---------------------");
						System.out.println("Studnet ID        : " + std.getSid());
						System.out.println("Student Name      : " + std.getSname());
						System.out.println("Student Address   : " + std.getSaddr());
					}
					
					break;
				case 3:
					System.out.println("Student ID : ");
					sid = br.readLine();
					sid = sid.toUpperCase();
					
					std = studentService.searchStudent(sid);
					if ( std == null ) {
						System.out.println("Status : Student doesn't exist!!");
					} else {
						// student exists
						System.out.print("Student Name [Old Name : " + std.getSname() + "], New : ");
						String sname_New = br.readLine();
						if(sname_New == null || sname_New.equals("")) {
							sname_New = std.getSname();
						}
						
						System.out.print("Student Address [Old Address : " + std.getSaddr() + "], New : ");
						String saddr_New = br.readLine();
						if(saddr_New == null || saddr_New.equals("")) {
							saddr_New = std.getSaddr();
						}
						
						Student std_New = new Student();
						std_New.setSid(sid);
						std_New.setSname(sname_New);
						std_New.setSaddr(saddr_New);
						
						status = studentService.updateStudent(std_New);
						
						System.out.println("Status : " + status);
						
					}
					
					break;
				case 4:
					System.out.println("Student ID : ");
					sid = br.readLine();
					sid = sid.toUpperCase();
					
					std = studentService.searchStudent(sid);
					if ( std == null ) {
						System.out.println("Status : Student doesn't exist!!");
					} else {
						status = studentService.deleteStudent(sid);
						System.out.println("Status : " + status);
					}
					break;
					
				case 5:
					System.out.println("***** ThanQ for using Student Application*****");
					System.exit(0);
				default:
					System.out.println("Provide option from list of options [1, 2, 3, 4, 5]");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

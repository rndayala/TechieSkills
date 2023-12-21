package com.rndayala.javaapp;

import java.util.Date;

 // Target class
public class GreetingsGenerator 
{
	// dependent object -- someone create it and give it to this class
	private Date date;
	
	public GreetingsGenerator() {
		System.out.println("GreetingsGenerator class is instantiated.");
	}
	
	public void setDate(Date d) {
		date = d;
	}
	
	// business logic of your class
	public String generateGreeting(String name) {
		int hour = date.getHours(); // get the hour in 24hr format
		String msg = "";
		if (hour < 12) {
			msg = "Good Morning! " + name;
		} else if (hour < 16) {
			msg = "Good Afternoon! " + name;
		} else if (hour < 20) {
			msg = "Good Evening! " + name;
		} else {
			msg = "Good Night! " + name;
		}
		return msg;
	}

	@Override
	public String toString() {
		return "GreetingsGenerator [date=" + date + "]";
	}
}

package com.rndayala.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rndayala.springcore.beans.Amazon;

public class LaunchApp {
	public static void main(String[] args) {
		
		// activating Spring IoC container
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Amazon amz = context.getBean("amazon", Amazon.class);
		boolean b = amz.initiateDelivery(1045.0);
	}
}

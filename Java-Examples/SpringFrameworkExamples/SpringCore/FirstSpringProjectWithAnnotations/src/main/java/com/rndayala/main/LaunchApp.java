package com.rndayala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rndayala.util.Password;

public class LaunchApp {

	public static void main(String[] args) 
	{
		// activating Spring IoC container
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Password p = context.getBean(Password.class);
		p.disp();

	}

}

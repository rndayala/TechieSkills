package com.rndayala.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rndayala.beans.HelloBean;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext ("com/rndayala/cfgs/spring_beans_config.xml");
		HelloBean bean=(HelloBean) context.getBean("hello");
		System.out.println(bean.sayHello());
	}
}

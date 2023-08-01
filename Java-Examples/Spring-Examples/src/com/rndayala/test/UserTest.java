package com.rndayala.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rndayala.beans.User;

public class UserTest {
	public static void main(String[] args) throws Exception {
		Resource resource = new ClassPathResource("com/rndayala/cfgs/beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		User user = (User) factory.getBean("user");
		user.display_User_Details();
	}
}

package com.rndayala.service;

import org.springframework.stereotype.Service;

// spring framework internally creates a class reference variable
// by following convention : camelCase notation => businessLogic
@Service
public class BusinessLogic 
{
	public BusinessLogic() {
		System.out.println("Instantiating Service object using default constructor.");
	}
}

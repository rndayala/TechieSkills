package com.rndayala.dao;

import org.springframework.stereotype.Repository;

//spring framework internally creates a class reference variable
//by following convention : camelCase notation => dataModel
@Repository(value="datarepo")
public class DataModel 
{
	public DataModel() {
		System.out.println("Instantiating DataModel object using default constructor.");
	}
}

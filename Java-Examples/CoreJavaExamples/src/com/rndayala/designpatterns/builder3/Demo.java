package com.rndayala.designpatterns.builder3;

public class Demo {
	public static void main(String[] args) {
		// creating person object, specifying first, last name, age and address
		Person person1 = new Person.Builder("John", "Doe")
                					.age(30)
                					.address("123 Main Street")
                					.build();

		// creating person object, specifying first, last name, and age
        Person person2 = new Person.Builder("Jane", "Smith")
                					.age(25)
                					.build();

        System.out.println(person1); // Person [firstName=John, lastName=Doe, age=30, address=123 Main Street]
        System.out.println(person2); // Person [firstName=Jane, lastName=Smith, age=25, address=null]
	}
}

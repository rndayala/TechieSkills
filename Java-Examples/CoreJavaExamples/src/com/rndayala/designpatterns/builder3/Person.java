package com.rndayala.designpatterns.builder3;

// in this builder design pattern implementation, we are using Builder as inner class.
// the inner class has access to private instance variable of the outer class.
public class Person {
    private  String firstName; // mandatory field for Person
    private  String lastName;  // mandatory field for Person
    
    private  int age;  // optional field
    private  String address; // optional field

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }
    
    // Getter methods (could be omitted for brevity)

    @Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ "]";
	}


	public static class Builder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String address;

        // we set the mandatory attributes using the constructor
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // optional attributes are set using the builder methods
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // The build() method in the Builder class constructs the Person object 
        // using the private constructor of the outer class.
        public Person build() {
            return new Person(this);
        }
    }
}
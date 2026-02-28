package com.sai.spring.spring_autowiring;

public class Student {
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	//DI(Setter) object creation for person in case of setter injection
	public Student() {
		
	}
	
	//DI(Setter) for injection of the address object in to the person
	public void setAddress(Address address) {
		this.address = address;
	}

	//DI(Constructor)
	//object creation of person as well as injection of the address 
	//object in to the person
	public Student(Address address) {
		super();
		this.address = address;
	}
}

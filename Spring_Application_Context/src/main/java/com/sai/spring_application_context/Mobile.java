package com.sai.spring_application_context;

public class Mobile {

	public Mobile() {
		System.out.println("object created");
	}

	@Override
	public String toString() {
		return "Mobile [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}

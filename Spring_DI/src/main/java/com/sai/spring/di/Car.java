package com.sai.spring.di;

public class Car {
	private Engine engine;

	//mandatory to use parameterized constructor when used with constructor-arg tag
	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

//	mandatory to use setter method when used with property tag
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}

}

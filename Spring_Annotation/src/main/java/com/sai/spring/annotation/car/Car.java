package com.sai.spring.annotation.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	//Setter injection
	//@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	//Constructor injection
	//@Autowired
	public Car(Engine engine) {
		super();
		this.engine = engine;
	}	
}

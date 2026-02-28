package com.sai.spring.annotation.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sai.spring.annotation.AppConfig;

public class App_Autowired_DI {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		Car c=ac.getBean(Car.class);
		System.out.println(c);
		System.out.println(c.getEngine());
	}
}

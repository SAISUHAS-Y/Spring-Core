package com.sai.spring.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory bf=new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	Car car=bf.getBean(Car.class);
    	System.out.println(car);
    	//printing the engine object using car =
    	System.out.println(car.getEngine());
    	
    	BeanFactory bf1=new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	System.out.println(bf1.getBean(Car.class));
    }
}
	
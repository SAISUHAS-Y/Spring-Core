package com.sai.spring.spring_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowire_ByName 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("Autowire_byName.xml");
    	Student s = ac.getBean(Student.class);
    	System.out.println(s);
    	System.out.println(s.getAddress());
    }
}

package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
		Person p = (Person) context.getBean("person1");
		
		System.out.println(p);
		
		Addition add =  (Addition) context.getBean("add");		
		add.doSum();
	}
}

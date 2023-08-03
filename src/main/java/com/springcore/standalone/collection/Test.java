package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
			ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standalone_config.xml");
			Person person1 = (Person) context.getBean("person1");
			
			System.out.println(person1);
			System.out.println(person1.getFriends());
			System.out.println(person1.getFriends().getClass().getName());
			
			System.out.println("--------------------------------------------------");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("--------------------------------------------------");
			
			System.out.println(person1.getFee_structure());
			System.out.println(person1.getFee_structure().getClass().getName());
	}
}

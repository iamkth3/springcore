package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig/javaconfig.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
		
//		Student student1 = context.getBean("student1", Student.class);
//		Student student1 = context.getBean("temp", Student.class);
		Student student1 = context.getBean("getStudent", Student.class);
		
		System.out.println(student1);
		student1.study();
		
		context.close();
	}
}

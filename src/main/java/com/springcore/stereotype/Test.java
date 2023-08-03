package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");

		
		//		name of class is Student so make its first letter small
//		Student student = (Student) context.getBean("student");
//		StudentKrishna student = context.getBean("studentKrishna", StudentKrishna.class);
		StudentKrishna student = context.getBean("ob", StudentKrishna.class);

		System.out.println(student);

		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());

//		so as many time we call the object it will give one hascode means it creats object only ones known as singleton and opposite to it ...creating object at each instance or at declaration new object it is called prototype
		System.out.println(student.hashCode());

		StudentKrishna student1 = context.getBean("ob", StudentKrishna.class);
		System.out.println(student1.hashCode());
		
		
		
		Teacher teacher1 = context.getBean("teacher1", Teacher.class);
		Teacher teacher2 = context.getBean("teacher1", Teacher.class);
		 System.out.println(teacher1.hashCode());
		 System.out.println(teacher2.hashCode());

	}
}

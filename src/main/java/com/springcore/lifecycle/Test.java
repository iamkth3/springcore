package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Samosa samosa1 = (Samosa) context.getBean("samosa1");
		
		context.registerShutdownHook();
		System.out.println(samosa1);
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		Kachori kachori1 = (Kachori) context.getBean("kachori1");
		System.out.println(kachori1);
		
		
		PepsiAnnotation pepsi1 = (PepsiAnnotation) context.getBean("pepsi1");
		System.out.println(pepsi1);
		
	}
}

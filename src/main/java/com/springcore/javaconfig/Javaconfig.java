package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class Javaconfig {
	
	public Samosa getSamosa() {
		Samosa samosa = new Samosa();
		return samosa;
	}
	
	
	@Bean
//	@Bean(name = {"student","temp","con"})
	public Student getStudent() {
		
//		creating new object
		Student student = new Student(getSamosa());
		return student;
	}
}

package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



//@Component("student1")


public class Student {
	
	
	
	private Samosa samosa;
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
		System.out.println("Student is enjoying");
		this.samosa.display();
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
}

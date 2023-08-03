package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PepsiAnnotation {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public PepsiAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PepsiAnnotation [price=" + price + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Started method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ended method");
	}
}

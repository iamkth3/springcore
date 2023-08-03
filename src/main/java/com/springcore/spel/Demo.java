package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{11+22}")
	private int x;
	
	@Value("#{99/11}")
	private int y;
	
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	
//	E and PI is a variable from java.lang.math class which is inbuilt class
	
	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	
	@Value("#{new java.lang.String('Krishna Hande')}")
	private String name;
	
	
	@Value("#{8-4>3}")
	private boolean isActive;
	
	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public int getX() {
		return x;
	}
	
//	@Value("32")
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
//	@Value("45")
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + ", name=" + name + ", isActive="
				+ isActive + "]";
	}


	

	
	
}

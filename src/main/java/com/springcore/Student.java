package com.springcore;

import java.util.Properties;

public class Student {
	private int student_id;
	private String studentName;
	private String studentAddress;
	
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		System.out.println("Setting student id");
		this.student_id = student_id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting student name");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting student address");
		this.studentAddress = studentAddress;
	}
	
	
	
	
	
	public Student(int student_id, String studentName, String studentAddress) {
		super();
		this.student_id = student_id;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

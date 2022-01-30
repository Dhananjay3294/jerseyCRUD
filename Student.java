package com.rest.JerseyDemo;

public class Student {
	
	private int studentId;
	private String studentName;
	
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public Student() {
		System.out.println("calling");
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}


}

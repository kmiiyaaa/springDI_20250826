package com.kmii.test;

public class StudentDto {
	
	
	private String name;
	private int age;
	private String gradeNum;
	private String classNUM;
	
	
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentDto(String name, int age, String gradeNum, String classNUM) {
		super();
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.classNUM = classNUM;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGradeNum() {
		return gradeNum;
	}


	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}


	public String getClassNUM() {
		return classNUM;
	}


	public void setClassNUM(String classNUM) {
		this.classNUM = classNUM;
	}
	
	
	
	

}

package com.mycompany.study.test.ch07.second;

public class Student extends People{
// 자식 	
	
//	public String name;
//	public String ssn;
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);  // 생성자
//		this.name = name;
//		this.ssn = ssn;
		this.studentNo = studentNo;
	}
	
	public Student (String name, String ssn) {
		super(name, ssn);
	}
	
	public Student () {
//		super();
	}
}

package com.mycompany.study.test.ch07.second;

public class StudentExample {
	
	public static void maidn(String[] args) {

		// 명시적 생성자를 사용하여 객체를 만들고(2개)
		// 모든 필드를 출력하시요
		
		Student studnet = new Student ("Tony", "1234-1234", 21);
		System.out.println(studnet.name);
		System.out.println(studnet.ssn);
		System.out.println(studnet.studentNo);
		
		
		
		Student student2 = new Student("Crystal", "4321-4321");
		
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);
		
	
	
	}
}

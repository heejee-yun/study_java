package com.mycompany.study.ch06;

public class Korean {

	// this 쓰기
	
	// k1 에 name ssn 
	// k2 에 name age 필요 
	
	String name;
	String ssn;
	int age;
	
	Korean(){ // 기본생성자 만드는 습관 !! 
		
	}
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}

	Korean(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
}

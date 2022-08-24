package com.mycompany.study.ch06;

public class Television {
	
	public static String company = "Samsung";
	public static String model = "OLED";	
	static final String info;
	
	public String version = "1.0";
	
	static {
		info = company + model;	// stastic 에서 선언된 정보만 넣어야함
	}
}

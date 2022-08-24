package com.mycompany.study.ch06;

public class Arithmetic {
	
	public int addReturn (int a, int b) {
		int add = 0;
		add = a + b;
		return add;
	}
	
	public int minusReturn(int a, int b) {
		int minus = 0;
		minus = a - b;
		return minus;
	}

	public int multipleReturn(int a, int b) {
		int multiple = 0;
		multiple = a * b;
		return multiple;
	}
	
	public int divideReturn(int a, int b) {
		int divide = 0;
		divide = a/b;
		return divide;
	}
	
	public int remaindReturn (int a, int b) {
		int remaind = 0;
		remaind = a % b;
		return remaind;
	}
	
	public int abc (int a) {
		return 1;
	}
	
	public String aaa(int a) {
		return "";
	}
	
	public boolean bbb (int a) {
		return true;
	}
	
	public double ccc (int a) {
		return 1.1;
	}
	
	public void ddd (int a) {
		
	}
	
	static void staticTest() {
		System.out.println("나는 토니당...");
	}
	
	
}

package com.mycompany.study.test.ch07.third;

public class ComputerExample {
	
	public static void main(String []args) {
		
		int r = 10;
		
		Calculator calculator = new Calculator ();
		
		System.out.println("원면적: " + calculator.areaCircle(2));
		
		Computer computer = new Computer();  // child
		
		
		System.out.println("원면적: " + calculator.areaCircle(2));
		
		
		
		
	}
}

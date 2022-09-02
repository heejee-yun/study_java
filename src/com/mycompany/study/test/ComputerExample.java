package com.mycompany.study.test;

public class ComputerExample {

	public static void main(String[] args) {
		
		double r = 7;
		
		Calculator calculator = new Calculator();
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + calculator.size(r));
		
		Computer computer = new Computer();
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + computer.size(r));

	}
}

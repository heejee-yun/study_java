package com.baewooga.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
//		int 변수에 v1 에 초기값 5
//		int 변수에 v2 에 초기값 2
		
		int v1 = 5;
		int v2 = 2;
		
		
//		int 변수 result1 에 + 연산후 출력
		int result1 = v1 + v2;
		System.out.println("result1: " + result1);
		
//		int 변수 result2 에 - 연산후 출력
		int result2 = v1 - v2;
		System.out.println("result2: " + result2);	
		
//		int 변수 result3 에 * 연산후 출력
		int result3 = v1 * v2;
		System.out.println("result3: " + result3);
		
//		int 변수 result4 에 / 연산후 출력
		int result4 = v1 / v2;
		System.out.println("result4: " + result4);
		
//		int 변수 result5 에 % 연산후 출력
		int result5 = v1 % v2;
		System.out.println("result5: " + result5);
		
		
//		************************************************중요
		double result6 = v1 / v2;
		System.out.println("result6: " + result6);
	
		double result7 = (double) v1 / v2;
		System.out.println("result7: " + result7);
//*********************************************************
		
		double asd1= 1.66667;
		
		double asd2 = 0.625;
		
		double asd3 = 9.8;
		
		double asd4 = (asd1-asd2)*asd3;
		
		System.out.println(asd4);
		
		double qwe1 = 5;
		
		double qwe2 = 3.25;
		
		double qwe3 = 1.83333;
		
		double qwe4 = 0.70588;
		
		double qwe5 = qwe1-(qwe2-qwe3)*qwe4;
		
		System.out.println(qwe5);
		
		
		
		
	}

}

package com.mycompany.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
		
		Arithmetic arithmetic = new Arithmetic();
								 	// 생성자  cf ()가 있으면 함수
		
		
		
		System.out.println(arithmetic.addReturn(1, 2));
		System.out.println(arithmetic.minusReturn(1, 2));
		System.out.println(arithmetic.multipleReturn(1, 2));
		System.out.println(arithmetic.divideReturn(1, 2));
		System.out.println(arithmetic.remaindReturn(1, 2));
		
		
		/*
		int resultAdd =  arithmetic.add(1,2);
		int resultMinus = arithmetic.minus(1,2);
		int resultMultiple = arithmetic.multiple(1,2);
		int resultDivide =  arithmetic.divide(1,2);
		int resultRemaind =  arithmetic.remaind(1,2);
		
		arithmetic.say(resultAdd);
		arithmetic.say(resultMinus);
		arithmetic.say(resultMultiple);
		arithmetic.say(resultDivide);
		arithmetic.say(resultRemaind);*/
		
		

	}

}

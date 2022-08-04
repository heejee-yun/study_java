package com.mycompany.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
// 		&& = & : and : 논리곱 : 연산 참 참 참, 하나라도 거짓이 있으면 거짓
// 		|| = | : or : 논리합 : 연산 참 거 참, 거 참 참, 참 참 참 , 거 거 거 
		
		int a = 65;
		
		boolean result1 = (a >= 65);
		System.out.println("result1: " + result1);
		
		boolean result2 = (a <= 90);
		System.out.println("result2: " + result2);
		
		if (a >= 65 & a <= 90) {
			System.out.println("65 보다 크거나 같고 90보다 작습니다");
		}
		
		if (a >= 65 && a <= 90) {
			System.out.println("65 보다 크거나 같고 90보다 작습니다");
		}
		
		System.out.println("--------------------");
		
		
		if (a >= 65 | a <= 90) {
			System.out.println("둘다 참");
		}
		
		if (a >= 66 | a <= 90) {
			System.out.println("하나만 참");
		}
		
		if (a >= 66 | a <= 50) {
			System.out.println("둘다 거짓이라 이글은 보이지 않아야 맞음");
		}
		
		
		

	}

}

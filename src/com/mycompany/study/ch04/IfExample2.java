package com.mycompany.study.ch04;

public class IfExample2 {
	
	public static void main(String[] args) {
	
	/* 
	 일반 1 , 5% 할인
	 브론즈 2, 10% 할인
	 실버3, 15% 할인
	 골드4, 20% 할인
	 플래티넘5, 2.7% 할인 
	 
	  정가 = 할인가
	 */
	
	int OriPrice = 1000;
	int level = 2;
	
	if(level == 1) {
		System.out.println((int)price*(1-0.05));
	}
	else if(level == 2) {
		System.out.println(price*0.10);
	}
	else if(level == 3) {
		System.out.println(price*0.15);
	}
	else if(level == 4) {
		System.out.println(price*0.20);
	}
	else {
		System.out.println(price*0.027);
	}
	
	}
	// 변수에 abc 말고 뭔지 꼭 쓰기 변수 세분화 해서 쓰기 함수는 짧게 짧게 많이 많이 조합조합
	public static void DisPrice (int OriPrice, int level ) {   

		System.out.println(price*0.05); 
	}
	
	
	}
}

package com.mycompany.study.ch04;

public class IfExample2 {
	
	public static void main(String[] args) {
	
	/* 
	 일반 1 , 5% 할인
	 브론즈 2, 10% 할인
	 실버3, 15% 할인
	 골드4, 20% 할인
	 플래티넘5, 2.7% 할인 
	 
	  정가 : 할인가
	 */
	
	int price = 1000;
	int level = 2;
	
	if(level == 1) {
		System.out.println("정상가" + ((int)price)+ ":" + "할인가" + (int)price*(1-0.05));
	}
	else if(level == 2) {
		System.out.println("정상가" + ((int)price)+ ":" + "할인가" + (int)price*(1-0.10));
	}
	else if(level == 3) {
		System.out.println("정상가" + ((int)price)+ ":" + "할인가" + (int)price*(1-0.15));
	}
	else if(level == 4) {
		System.out.println("정상가" + ((int)price)+ ":" + "할인가" + (int)price*(1-0.20));
	}
	else if (level == 5){
		System.out.println("정상가" + ((int)price)+ ":" + "할인가" + (int)price*(1-0.027));
	}
	else{
		System.out.println("레벨 5까지만 사용 가능합니다");
	}
	
	// 함수를 이용해서 쉽게 하는 벙법을 없을지 연구해보기 
	
	
	}
}

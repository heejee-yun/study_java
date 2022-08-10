package com.mycompany.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {
		/* 
		 일반 1 , 5% 할인
		 브론즈 2, 10% 할인
		 실버3, 15% 할인
		 골드4, 20% 할인
		 플래티넘5, 2.7% 할인 
		 
		  정가 : 할인가
		  
		  IfExample2 참고
		 */
		
		
		int level = 2;
		int price = 1000;
		
		
		switch(level) {
			case 1:
				System.out.println("정상가 : " + price + " / 할인가 : " + price*(1-0.05));
				break;
			case 2:
				System.out.println("정상가 : " + price + " / 할인가 : " + price*(1-0.10));
				break;
			case 3:
				System.out.println("정상가 : " + price + " / 할인가 : " + price*(1-0.15));
				break;
			case 4:
				System.out.println("정상가 : " + price + " / 할인가 : " + price*(1-0.20));
				break;
			case 5:
				System.out.println("정상가 " + price + " / 할인가 : " + price*(1-0.025));
				break;
			default:
				System.out.println("레벨을 확인 후 다시 입력해주세요");
				break;
		}
		
		//  switch  - case - break  이 구성 암기 필수 
		
		// 함수로 만든다면 겹치는 내용을 나 넣으면 될 듯 ?  함수 내용은 다른 곳에서 참고 필수 

	}

}

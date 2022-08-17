package com.mycompany.study.ch04;

public class ForExample {

	public static void main(String[] args) {

		// 아래 3개의 문제를 푸시오

//		**********     (참고로 *이 10개)
//		**********
//		**********
//		**********
//		**********
//		출력하는 프로그램을 만드시요

		// 생각 1] 1) * 를 스트링 잡기 2) 한 줄에 들어갈 * 수 잡기 3) 2번에서 잡은 숫자의 줄을 잡기
		// 생각 2] 좌표로 생각해서 1-10까지가 참으로 만들고 참이면 * 를 출력하게 만들고, 그걸 5줄고 만들기
		// 생걱 3] ********** 을 잡고 for 로 5줄 넣기
		// => 풀이 ]] 생각 1로 풀면 됨. 다만 Println은 줄이 바뀌니 그냥 print 

		String asterisk = "**********";
		for (int i = 1; i < 6; i++) {
			System.out.println(asterisk);

		} // 3번으로 넣음
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

		System.out.println("-------------");

//		 **********     ( 참고로 *표시는 10개임)
//		 *		  *
//		 *	      *
//		 *		  *
//		 **********
//		 출력하는 프로그램을 만드시오		

		// 내 생각 : 1) true 일 떄 *를 출력한다 2)표시를 숫자로 썼을 때 (12345 식), 1열 모두 true 2열-9열을 작은 수 큰
		// 수만 true, 10열을 모두 true
		// true 가 아닌 출력할 부분만 *로 출석 나머지는 빈칸으로 출력
		// = > 풀이 ]] 

		String asteriskSingle = "*";
		String blank = " ";
		for (int i = 1; i < 6; i++) {
			 if(i==1) { if(i == 1){
			 
			 } System.out.println(asteriskSingle); 
			 } else { System.out.println(blank); 
			 }
			 
			System.out.println(asteriskSingle);
		}
		
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i>=2 && i<=4) {
					if(j>=2 && j<=9) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("-------------");

//		 1
//		 12
//		 123
//		 1234
//		 12345
//		 123456
//		 1234567
//		 12345678
//		 123456789
//		 1 3 5 7 90

//		 출력하는 프로그램을 만드시오

		// 생각 1) 1부터 9까지는 차례로 느는 줄을 만들기 2)마지막 줄은 짝수가 아닌 것으로 출력 

		for(int i=1; i<=10; i++) {
			if(i == 10) {
				for(int j=1;j<=i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			}else {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}

}

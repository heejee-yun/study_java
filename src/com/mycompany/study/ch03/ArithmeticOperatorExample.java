package com.mycompany.study.ch03;

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
		
		double i1 = 1+(double)2/3;  // 분수끼리 더하기 한 부분을 표현한 문제 
		double i2 = (double)5/8;	 
		double i3 = 9+(double)4/5;
		double r1 = (i1-i2)*i3;
		System.out.println("r1 : " + r1);
		
		sum(8,7,5); // 3가지 숫자를 더해야하는 연습 문제 
		sum(1,9,5);
		sum(5,6,5);
		sum(4,7,1);
		sum(7,5,5);
		
		
		avg("홍길동",60,70,85,90,45); // 시험 성적이 있는 엑셀을 보고 평균 구하는 것
		avg("박말순",50,75,70,60,70);
		avg("고장난",55,60,64,58,90);
		avg("도롱뇽",80,70,63,88,78);
		
		
	}
	// 3가지 숫자를 더해야하는 연습 문제의 함수 
	public static void sum(int a, int b, int c) {
		
		System.out.println(a + "+" + b + "+"+ c + "+" + "=" + (a+b+c) );
		
	}
	// 변수에 abc 말고 뭔지 꼭 쓰기 변수 세분화 해서 쓰기 함수는 짧게 짧게 많이 많이 조합조합
	public static void avg(String name, int b , int c, int d, int e, int f ) {   

		System.out.println( name + "의 평균 점수는 " + ((double)(b+c+d+e+f)/5) +"입니다"); 
	}
	
}

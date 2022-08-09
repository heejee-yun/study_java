package com.mycompany.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {
		// int 타입의 변수를 3개 선언하고
		// 세 정수 중에서 최대값 최소값을 구하는 프로그램을 작성하시오

		int a = 7;
		int b = 7;
		int c = 7;
		
		/* if (a>((a+b+c)/3)){
			System.out.println("최대 값은 a :" + a );
			if (b>((a+b+c)/3)){
				System.out.println("최대 값은 b :" + b);
			}else if (c>((a+b+c)/3)){
				System.out.println("최대 값은 c :" + c);
			}else if (a<((a+b+c)/3)){
				System.out.println("최소 값은 a :" + a);
			}else if (b<((a+b+c)/3)){
				System.out.println("최소 값은 b :" + b);
			}else if(c<((a+b+c)/3)){
				System.out.println("최소 값은 c :" + c);
			}else if(a==b && b==c) {
				System.out.println("셋은 모두 같습니다");
			}
		}else{
			// 셋 중 같은 같이 있을 경우 
			System.out.println("다수의 최소 혹은 최대의 값이 있습니다");
		}
		*/
		
		if(a != b && b!=c && c !=a) {
			if(a>b && a>c) {
				System.out.println("최대 값은 a :" + a );
			}else if (b>c && b>c) {
				System.out.println("최대 값은 b :" + b );
			}else {
				System.out.println("최대 값은 c :" + c );
			}
			
			if(a < b && a < c) {
				System.out.println("최소 값은 a :" + a );
			}else if (b < c && b < c) {
				System.out.println("최소 값은 b :" + b );
			}else {
				System.out.println("최소 값은 c :" + c );
			}
		}else {
			System.out.println("적어도 2개의 통일한 정수가 존대합니다");
		}
		
			
		
	}
}

package com.mycompany.study.ch04;

public class IfExample5 {

	public static void main(String[] args) {
		// int 타입의 변수 2개를 선언하고 
		// 두 정수가 주어졌을 때 사분명 어디에 해당되는지 출력하는 프로그램

		int a = -2;
		int b = 2;
		
		if( a> 0 & b> 0) {
			System.out.println("제 1사분면");
		}else if(a< 0 && b> 0) {
			System.out.println("제2사분면");
		}else if(a< 0 && b< 0) {
			System.out.println("제3사분면");
		}else if(a< 0 && b< 0) {
			System.out.println("제4사분면");
		}else if(a==0 && b!=0) {
			System.out.println("x축 위에 있습니다");
		}else if(a!=0 && b==0) {
			System.out.println("y축 위에 있습니다");
		}else {
			// a==0 & b==0 
			System.out.println("원점에 있습니다");
		}
		
		// 처음에 마이너스 넣으면 원점에만 있다고 나왔음
		// => x 축과 y 축에 대한 부분을 안 넣어서 그런 듯 
	}

}

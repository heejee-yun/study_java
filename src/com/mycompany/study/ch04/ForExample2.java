package com.mycompany.study.ch04;

public class ForExample2 {

	public static void main(String[] args) {
		
//		**********
//		**********
//		**********
//		**********
//		**********
		

//		for (int i = 0; i < 10; i++) {
//				System.out.print("*");
//		}
//			
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			
		
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
		}
		
		

//		0123456789
//		0123456789
//		0123456789
//		0123456789
//		0123456789
		
		for (int i = 0; i < 5; i++) { // 5줄
			System.out.println();
			for (int j = 0; j < 10; j++) {
				System.out.print(j);
			}
		}
		
//		구구단
		
		
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}

// 		*
//		**
//		***
//		****
//		*****
		
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
		}
		
//		*****
//		******		
//		******	
//		******			
//		******		
			
	}
}

package com.mycompany.study.ch05;

public class ArrayCreatByNewExample {

	public static void main(String[] args) {
		
		int [] arr1 = new int [3];
		
		int[] arr2; 
		arr2 = new int [5];
		
		
//		int[] b = new int [30];
//		 위와 아래는 표현은 다르지만 기능은 같음
//		int[] c;
//		b = new int[30];
		
		arr1[0] = 77;
		System.out.println("arr1[0] : " + arr1[0]);
		
		arr1[1] = 88;
		System.out.println("arr1[1] : " + arr1[1]);

		arr1[2] = 99;
		System.out.println("arr1[2] : " + arr1[2]);
		
	}

}

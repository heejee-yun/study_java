package com.mycompany.study.test.ch07.forth;

public class Parents {
// 부모 
 
	int sum = 0;
	int[] arr = new int [3];
	
	public void SortbyAsc(int arr[]) {
		
		for (int i = 0; < arr.length; i++) {
			for (int j = 0; j < arr.length-1 ; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}		
		
		}
		
	}
	
	public int getSum(int arr[]) {
		sum = ( arr[0] * arr[1] ) + arr[2];
		return sum;
	}
	
	public void printArr(int arr[]) {
		for (int  = 0;  < arr.length; ++) {
			System.out.println(arr[i] + "");
		}
		System.out.println(" ");
	}
	
}

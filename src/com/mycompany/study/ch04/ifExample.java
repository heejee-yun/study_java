package com.mycompany.study.ch04;

public class ifExample {

	public static void main(String[] args) {
		
		int exampleScore = 80;
		
		if(exampleScore >= 90) {
			System.out.println("A");
		} else {
			System.out.println("A는 아니구나");
		}
		
		
		System.out.println("--- 학점 표현하기 ---");
		
		int score = 85;
		
		if(score >= 90) {
			if(score >= 97) {
				System.out.println("A+");
			}
			else if(score <= 92) {
				System.out.println("A-");
			}
			else {
				System.out.println("A");
			}
		}
		else if(score >= 80 & score < 90) {
			if(score >= 87) {
				System.out.println("B+");
			}
			else if(score <= 82)
				System.out.println("B-");
			else {
				System.out.println("B");
			}
		} 
		else if(score >= 70 & score < 80) {
			if(score >= 77) {
				System.out.println("C+");
			}
			else if(score <= 72)
				System.out.println("C-");
			else {
				System.out.println("C");
			}
		} 
		else if(score >= 60 & score < 70) {
			if(score >= 67) {
				System.out.println("D+");
			}
			else if(score <= 62)
				System.out.println("D-");
			else {
				System.out.println("D");
			}
		} 
		else {
			System.out.println("F");
		}
				

		
		
	}
}

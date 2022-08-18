package com.mycompany.study.ch05;

public class ArrayInaArrayExample {

	public static void main(String[] args) {
				
				int[][] scores = {{99,88,55},{55,77,66},{55,55,44},{55,55,44},{55,55,77}};
				
				System.out.println("scores[1][1] : " + scores[1][1]);
				
				System.out.println("scores[2][2] : " + scores[2][2]);
				
				String[] name = {"한찬구","장동건","고소영","박태환","싸이"};
				String[] subject = {"국어","영어","수학"};
				
				
				//1 개인의 평균
				/*
				for(int i=0; i<5; i++) {
					int sum=0;
					for(int j=0; j<3; j++) {
						sum +=scores[i][j];
					}
					System.out.println(name[i]+"의 평균 점수는: "+((double)sum/3));
				}
				System.out.println("------------------------------");
				*/
				for(int i=0; i<scores.length; i++) {
					int sum=0;
					for(int j=0; j<scores[i].length; j++) {
						sum +=scores[i][j];
					}
					System.out.println(name[i]+"의 평균 점수는: "+((double)sum/3));
//					System.out.println(name[i]+"의 평균 점수는: "+((double)sum/scores[i].length));
				}
				
				System.out.println("------------------------------");
				//2 과목별 평균
				for(int j=0; j<3; j++) {
					int sum=0;
					for(int i=0; i<5; i++) {
						sum +=scores[i][j];
					}
					System.out.println(subject[j]+" 과목의 평균 점수는: "+((double)sum/5));
				}

			
				// 숙제 : 한찬구랑 싸이의 전과목 성적 바꾸기 
				
				
				
				/*
				 * double i = 0; double j = 0; for (double i = 0; i < 2; i++) { for (double j =
				 * 0; j < 5; j++) {
				 * 
				 * } } System.out.println("국어 평균 : " + (scores[i][j])/scores.length);
				 */
	}

}

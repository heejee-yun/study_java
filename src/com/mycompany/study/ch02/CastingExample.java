package com.mycompany.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
		// 강제 형변환 : casting : (원하는 형) 변수형
		
		double doubleValue = 1234567.0;
		System.out.println("doubleValue: " + doubleValue);

		double doubleValue2 = 1234567891;
		System.out.println("doubleValue2: " + doubleValue2); //7자리 이상인 경우에는 e로 표현됨
		
		// float 변수에 double 대입 
		float floatValue = (float) doubleValue;
		System.out.println("floatValue: " + floatValue);
		
		//long <- float
		long longValue = (long) floatValue;
		System.out.println("longValue: " + longValue);
		
		//int <-long 
		
		// byte<-short
		 
		
		// int를 string 으로 변환
		int intValue = 123;
		String str1= Integer.toString(intValue);
		String stringValue = String.valueOf(intValue);
		System.out.println(str1);
		
		// string 을 int로 변환
		String str2 ="123";
		int intValue2 = Integer.parseInt(str2);
		System.out.println(intValue2);
	}

}

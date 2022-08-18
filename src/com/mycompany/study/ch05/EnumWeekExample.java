package com.mycompany.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week abc;
		
//		abc = 1;			// 데이터 타입 틀림
//		abc = "asdf";		// 내용이 틀림
//		abc = 1.1;
		abc = Week.MONDAY;  // 데이터 타입도 맞고, 내용도 맞아야 호출 가능 
		System.out.println(Week.FRIDAY);
		
		System.out.println("Week.FRIDAY " + Week.FRIDAY);
		System.out.println("abc : " +  abc);
		
// 		String name = abc;
		String name = abc.name();
		System.out.println("name : " + name);
		
		int ordinal = abc.ordinal();
		System.out.println("ordinal : " + ordinal);
		
		Week xyz = Week.THURSDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println("result1 : " +   result1);
		System.out.println("result2 : " +   result2);
		
		Week[] days = Week.values();
		
		int index = 0;
		for(Week day: days) {
			System.out.println(index + ": day: " + day);
			index ++;
		}
		

	}

}

package com.mycompany.study.ch02;

public class PromotionExample {

	private static final String shortValue = null;

	public static void main(String[] args) {
// 		자동 타입 변환(Promotion)
//		작은 형이 큰 형으로 변환은 문제가 발생하지 않는다.
//		큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 손실이 발생한다. 
		
//		byte< short< int< long< float< double
//	byte short #int long <-정수  / 실수 -> float # double		
		
//		byte byteValue = 10;
//	System.out.println("byteValue: " + byteValue);

//		int intValue = byteValue; // 10 
//		System.out.println("intValue: " + intValue);
		
//		int intValue2 = 1234567890;
//		System.out.println("intValue" + intValue);
		
		//byte byteValue2 = intValue2; 
		//System.out.println("byteValue2" + byteValue2); 
		
//		int inValue3 = 200;
//		System.out.println("intValue3: " + inValue3 + "입니다!!!");
		
//		double doubleValue = inValue3;
//		System.out.println("doubleValue: " + doubleValue + "입니다!!");
		
		
	// -------------
		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue);
	
		short shortValue = byteValue;
		// int 에 short 대입 후 출력
		
		int intValue = shortValue;
		System.out.println("intValue: " + intValue);
	
		// long 에 int 대입 후 출력
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
	
		// float 에 long 대입 후 출력	
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		// double 에 float 대입 후 출력
		double doubleValue = floatValue;
		System.out.println("doubleValue: "+ doubleValue );
	
	
	
	}

}

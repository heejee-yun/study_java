package com.mycompany.study.ch02;

public class Hello {

	public static void main(String[] args) {

//		데이터타입 변수명 = 초기값;
//		데이터타입 변수명
		
		boolean width = false;
		boolean xyz;
		width = true;
		

		String id = "junjhoe90";	
		String pw ="****";
		String name ="이준호";
		String tel ="01023456789";
		String email ="junhoe@asd.com";
		String dob ="1990822";
		String gender = "남";
		int level = 1;
		String path = "인스타광고";
		String goal = "git 잔디심자";
		double a = 0.5;
		System.out.println(a);
		char b = '문';
		// 문자열은 " / 문자 '  
		System.out.println(name);
		System.out.println("name 변수에 들어가 있는 값은:" + name);
		
		System.out.println("귀하의 비밀번호는 " + pw + "입니다");		
		System.out.println("기입하신 성함은 " + name + "입니다");
		System.out.println(tel + "로 전화 부탁드립니다");
		System.out.println("요청한 파일은 기입하신 이메일주소(" + email + ")로 보냈습니다");
		
		System.out.println(width);
	}

}

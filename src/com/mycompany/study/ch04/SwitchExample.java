package com.mycompany.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {

		int num = 1;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나옵니다");
				break;
			case 2:
				System.out.println("2번이 나옵니다");
				break;
			default:
				System.out.println("1도 2도 아닌 정수입니다");
				break;
				// break 가 없으면 계속 내려감
		}
		
		String position = "사원";
		
		switch (position) {
			case "사원": //if(position.equals)랑 같음
				System.out.println("연봉은 5000입니다");
				break;
			case "대리":
				System.out.println("연봉은 6000입니다");
				break;
			case "과장":
				System.out.println("연봉은 7000입니다");
				break;
			case "부장":
				System.out.println("연봉은 8000입니다");
				break;
			case "사장":
				System.out.println("연봉은 10000입니다");
				break;
			default:
				System.out.println("직함을 다시 확인해주세요");
				break;
				
			
		}

	}

}

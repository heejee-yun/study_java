package com.mycompany.study.test.ch07.first;

public class CellPhone {
// 부모
	
	// 필드
	String model;
	String color;
	
	// 생성자
	
	// 메소드
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("자기: " +  message);}
	void receiveVoice(String message) {System.out.println("상대방: " +  message);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
	
	// 오버 로드와 라이드에 대한 차이점 
	// 오버 ㄹ ㅏ 이드 ㅅ ㅏ ㅇ 속 ㅈ ㅏ 식. 즉 상속에서 자식 extends 부모 순으로 넣음 
	
	
}
	

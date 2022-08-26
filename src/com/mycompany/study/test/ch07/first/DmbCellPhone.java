package com.mycompany.study.test.ch07.first;

public class DmbCellPhone extends CellPhone{
// 자식
	
	//필드 
	int channel; 
	
	
	//생성자 ()sssdddd
	DmbCellPhone(){
	}
	
	

	// 메소드 
	
	void turnOnDmb() {System.out.println("전원 킴");}
	void changeChannel(){System.out.println("체널 바꿈");}
	void turnOff() {System.out.println("전원 끔");}
	
} 

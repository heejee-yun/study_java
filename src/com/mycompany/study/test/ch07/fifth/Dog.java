package com.mycompany.study.test.ch07.fifth;

public class Dog extends Animal{
	public Dog(){
		this.kind = "포유류";
		}
	
	@Override
	public void sound() {
		System.out.println("으으렁");
	}
	
	@Override
	public void sound(String m) {
		
	}
	
}

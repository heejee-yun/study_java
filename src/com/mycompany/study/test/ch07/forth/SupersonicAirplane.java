package com.mycompany.study.test.ch07.forth;

public class SupersonicAirplane extends Airplane {
		
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	@Override
	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("초음음속비행합니다");
		} else {
			super.fly();
		}
	}
} 





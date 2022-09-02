package com.mycompany.study.test;

public class Computer extends Calculator {

	@Override
	public double size(double r) {
		return r*r*Constants.PAI_2;
	}

}

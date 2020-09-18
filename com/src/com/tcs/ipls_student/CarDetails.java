package com.tcs.ipls_student;

public class CarDetails implements Car{

	@Override
	public void carName() {
		System.out.println("BMW");
		
	}

	@Override
	public void carSpeed() {
		System.out.println("The max speed 150km/hr");
		
	}

	@Override
	public void carManufacturer() {
		System.out.println("Siddharth Industries");
		
	}

	
}

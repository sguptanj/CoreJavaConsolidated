package com.tcs.ipls_student;

public class Circle {
	private int radius = 0;
	private final float pi = 3.14f;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public Circle() {
		super();
		radius = 40 ;
	}
	
	public float area()
	{
		return (pi * radius * radius);
	}
	
	public float perimeter()
	{
		return (2*pi*radius);
	}
}



package com.tcs.ipls_student;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		Circle cc = new Circle();
		System.out.println("The value of Radius: "+cc.getRadius());
		System.out.println("The area of the area: "+cc.area());
		System.out.println("The value of the perimeter: "+cc.perimeter());
		
		System.out.print("Enter the new Radius Value: ");
		Scanner scn = new Scanner(System.in);
		cc.setRadius(scn.nextInt());
		System.out.println("The value of Radius: "+cc.getRadius());
		System.out.println("The area of the area: "+cc.area());
		System.out.println("The value of the perimeter: "+cc.perimeter());

	}

}

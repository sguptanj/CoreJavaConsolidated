package com.tcs.ilp_learnings;

import java.util.Scanner;

public class StuMainClass {

	public static void main(String[] args) {
		
		// Using the getter and setters to get and set the values
		Student stu = new Student();
		System.out.println("Enter the details pls: ");
		System.out.print("Student Name: ");
		Scanner scn = new Scanner(System.in);
		stu.setStu_name(scn.nextLine());
		System.out.print("Student Stream: ");
		stu.setStream(scn.nextLine());
		System.out.print("Student Roll No: ");
		stu.setStu_id(scn.nextInt());
		System.out.print("Student Age: ");
		stu.setAge(scn.nextInt());
		
		
		
		
		System.out.println("Please verify the entered details\n");
		System.out.println("The Name entered is " +stu.getStu_name());
		System.out.println("The Roll No entered is " +stu.getStu_id());
		System.out.println("The Age entered is " +stu.getAge());
		System.out.println("The Stream entered is " +stu.getStream());
		
		stu.maths = 94;
		stu.physics = 96;
		stu.chemistry = 45;
		
		int total = stu.Sum(stu.maths, stu.physics, stu.chemistry);
		
		System.out.println("The total marks obtained in science is: " +total);
			
	}

	

}

package com.tcs.ilp_learnings;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// using the scanner class to get the user inputs
		Scanner snc = new Scanner(System.in);
		System.out.print("Please enter ur name: ");
		String name = snc.nextLine();
		System.out.println("Hello " +name + " Welcome Back!");
		System.out.print("Please enter ur age: ");
		int num = snc.nextInt();
		System.out.println("You are "+num +" yrs old " + name);
	}

}

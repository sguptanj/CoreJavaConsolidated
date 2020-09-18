package com.tcs.ilp_learnings;

import java.util.Scanner;

public class SmartFeed {

	public static void main(String[] args) {
		// Prog to enter the marks of five subjects of the students
		
		String std_name = "Siddharth Gupta";
		System.out.println("Hello! " +std_name+  " Welcome back");
		System.out.println("Pls enter the mark in the feed: ");
		int i;
		String subject[] = {"English", "Hindi", "Maths"};
		int marks[] = {0,0,0};
		int sum = 0, total = 3;
		double percentage = 0.0, avg =0.0;
		
		
		for (i=0; i<3;i++)
		{
			System.out.print(subject[i] + " ");
			Scanner scn = new Scanner(System.in);
			marks[i] = scn.nextInt();
			sum = sum + marks[i];
		}
		avg =  sum;
		avg = avg / total;
		percentage = avg ;
		System.out.println("The total Marks are: "+ sum);
		System.out.println("The average is: "+avg);
		System.out.println("The percentage is: "+percentage);
		

	}

}

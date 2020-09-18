// to print the name and the marks of the student 

package com.tcs.ilp_learnings;

public class Marks {

	public static void main(String[] args) {
		// 
		String std_name = "Siddharth Gupta";
		
		// declaring the array 
		String sub[] = {"English", "Hindi", "Mathematics"};
		int marks[] = {88, 89, 90};
		
		/*
		// memory allocating of the array
		sub = new String [4];	
		marks = new int [4];
		
		
				// Storing the values in the array
		sub[0] = "English";
		sub[1] = "Hindi";
		sub[2] = "Mathematics";
		
		marks[0] = 88;
		marks[1] = 89;
		marks[2] = 90;
		*/
		
		// Avg Marks & Percentage
		float avg_mark = 0f;
		avg_mark = (marks[0] + marks[1] + marks[2])/3;
		
		float percen = 0f;
		percen =( (marks[0] + marks[1] + marks[2])*100) / 300;
		
		// Printing the marks of the student
		System.out.println("The name of the student is "+std_name );
		System.out.println("The marks in " + sub[0] + ": " +marks[0]);
		System.out.println("The marks in " + sub[1] + ": " +marks[1]);
		System.out.println("The marks in " + sub[2] + ": " +marks[2]);
		System.out.println("The avg marks of student " + avg_mark);
		System.out.println("The percent of student " + percen + "%");
		

	}

}

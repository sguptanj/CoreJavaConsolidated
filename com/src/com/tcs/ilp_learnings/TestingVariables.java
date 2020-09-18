package com.tcs.ilp_learnings;

public class TestingVariables {

	public static void main(String[] args) {
		// the code test the variables in the java 
		// We always use the concatinate operator while printing the strings
		String name = "Siddharth Gupta";
		 
		byte human_age = 27 ; // from range -128 t0 127
		short a;
		int  b;
		long c;
		char grade = 'A';
		float tax_slab =  7.0990f ; // by default the decimal are double 
		double tax_paid = tax_slab * 0.85;
		boolean employed_status = false;
		System.out.println("The value of name is : " +name);
		System.out.println("The value of age is : " +human_age);
		System.out.println("The value of grade is: " +grade);
		System.out.println("The value of tax_slab is: " +tax_slab);
		System.out.println("The value of tax_paid is: " +tax_paid);
		System.out.println("The value of employed_status is: " +employed_status);
	}

}

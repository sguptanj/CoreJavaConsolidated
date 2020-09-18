package com.tcs.ipls_student;

public class Prog_Main {
	public static void main(String args[])
	{
		Programmer prog = new Programmer();
		prog.displaydetails();
		
		// modifing the values using the Getters and setters 
		prog.setProg_id("CSE102");
		prog.setProg_salary(1000.00f);
		prog.displaydetails();
		
		
	
	}

	
}

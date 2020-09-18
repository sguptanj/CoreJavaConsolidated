package com.tcs.ipls_student;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Tech tc = new Tech();
		Design dc = new Design();
		Hr hc = new Hr();
		
		//Retrieving the hardcoded Dummy Data
		// Getting the Salary for Tech, Design and HR
		
		// Tech
		System.out.println("Employee Name: "+tc.getEmp_name());
		System.out.println("Employee Id: "+tc.getEmp_id());
		System.out.println("Employee Age: "+tc.getEmp_age());
		System.out.println("Employee Salary "+tc.getSalary(300, 180));
		
		// Design
		System.out.println("Employee Name: "+dc.getEmp_name());
		System.out.println("Employee Id: "+dc.getEmp_id());
		System.out.println("Employee Age: "+dc.getEmp_age());
		System.out.println("Employee Salary "+dc.getSalary(800, 5));
		
		// HR
		System.out.println("Employee Name: "+hc.getEmp_name());
		System.out.println("Employee Id: "+hc.getEmp_id());
		System.out.println("Employee Age: "+hc.getEmp_age());
		System.out.println("Employee Salary "+hc.getSalary(1200, 1));
		
		
		
		
		
		

	}

}

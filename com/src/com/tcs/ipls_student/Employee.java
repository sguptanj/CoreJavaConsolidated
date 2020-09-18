package com.tcs.ipls_student;

public class Employee {
	
	// Declaration
	private String Emp_id;
	private String Emp_name;
	private String Emp_age;
	
	// Getter and Setters
	public String getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(String emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public String getEmp_age() {
		return Emp_age;
	}
	public void setEmp_age(String emp_age) {
		Emp_age = emp_age;
	}
	
	// Constructors
	public Employee(String emp_id, String emp_name, String emp_age) {
		super();
		Emp_id = emp_id;
		Emp_name = emp_name;
		Emp_age = emp_age;
	}
	// Dummy data hardcoded
	public Employee() {
		super();
		Emp_name = "SIDDHARTH GUPTA";
		Emp_id = "1004428";
		Emp_age = "27"; 	
	}
}
	

class Tech extends Employee {
	
	float getSalary(float hourly_wage, int hours_worked) {
		return hourly_wage * hours_worked;
		
	}
		
	}

class Design extends Employee {
	float getSalary(float weekly_wage , int weeks_worked) {
		return weekly_wage*weeks_worked;
		
	}
	
}
	

class Hr extends Employee {
	float getSalary(float monthly_wage, int months_worked) {
		return monthly_wage*months_worked;
		
	}
	
}
	



package com.tcs.ipls_student;

public class Programmer {
	private String prog_id = null;
	private float prog_salary = 0.0f;
	
	void displaydetails() {
		System.out.println("Programmer Id: "+prog_id);
		System.out.println("Programmer Salary: "+prog_salary);
	}

	public String getProg_id() {
		return prog_id;
	}

	public void setProg_id(String prog_id) {
		this.prog_id = prog_id;
	}

	public float getProg_salary() {
		return prog_salary;
	}

	public void setProg_salary(float prog_salary) {
		this.prog_salary = prog_salary;
	}

	public Programmer(String prog_id, float prog_salary) {
		super();
		this.prog_id = prog_id;
		this.prog_salary = prog_salary;
	}

	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
		prog_id ="CSE101";
		prog_salary = 1.0f;
	}
	

}

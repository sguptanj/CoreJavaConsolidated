package com.tcs.ilp_learnings;

public class Student {
	private String stu_name = null;
	private int stu_id = 0;
	public int age = 0;
	public String stream = null;
	int maths = 0;
	
	public Student(String stu_name, int stu_id, int age, String stream, int maths, int physics, int chemistry,
			int total) {
		super();
		this.stu_name = stu_name;
		this.stu_id = stu_id;
		this.age = age;
		this.stream = stream;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.total = total;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	int physics = 0;
	int chemistry = 0;
	int total =0;
	
	
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	int Sum(int a , int b, int c )
	{
		total = a + b + c;
		return total;
		
	}
	

}

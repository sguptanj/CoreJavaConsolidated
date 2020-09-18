package com.tcs.ipls_student;

public class AgeException extends Exception{
	
	
	public String toString()
	{
		return "INVALID USERID";
	}
	
	
class InvalidUserIdException extends AgeException{
	
	public String toString() {
		return "Invalid User ID";
	}
}

}

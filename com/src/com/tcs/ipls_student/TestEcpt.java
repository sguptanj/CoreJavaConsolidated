package com.tcs.ipls_student;

import java.util.Scanner;

public class TestEcpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 40;
		int c[] = new int [2];
		int age =10;
		
		
		try {
			c[1] = 20;
			try {
				System.out.println(a/b);
			}catch(ArithmeticException e) {
				System.out.println(e);
			}
			    }
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		try {
			if (age < 18 )
			{
				throw new AgeException();
			}
		}catch (AgeException e1)
		{
			System.out.println(e1);
		}
	
	
		
		int user_id = 0;
		System.out.println("User ID: ");
		Scanner scn = new Scanner(System.in);
		user_id = scn.nextInt();
		
		try {
			if (user_id != 1234)
			{
				throw new AgeException();
			}
			else {
				System.out.println(" hello" +user_id);
			}
			}catch(AgeException e2) {
				System.out.println(e2);
			}
		
		
		
	}

}

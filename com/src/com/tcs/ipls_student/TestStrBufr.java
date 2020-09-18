package com.tcs.ipls_student;

//@author: Siddharth Gupta
//Date: 14-09-2020

public class TestStrBufr {

	public static void main(String[] args) {
		// TODO to test the string buffer method of the strings
		
		StringBuffer sb = new StringBuffer("Siddharth");
		String name = "Siddharth";
		int len1 = name.length();
		int len3 = sb.capacity();
		int len2 = sb.length();
		System.out.println("The string length "+len1);
		System.out.println("The string length "+len2 + " capacity "+len3);
	}

}

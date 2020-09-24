package com.tcs.jv_advance_concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleRead {
	
	private static String fileName = "C:\\Users\\SIDDHARTH GUPTA\\git\\JavaProjects\\com\\src\\com\\tcs\\jv_advance_concepts\\testfile.txt";
	private static StringBuilder builder = null;
	private static Scanner input = null;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO to read the details of the file
		
		System.out.println("Read the contains of the file");
		input = new Scanner(new File(fileName));
		builder = new StringBuilder();
		read();
	}
	
	public static void read()
	{
		while (input.hasNext())
		{
			builder.append(input.next());
			builder.append(" ");
		}
		System.out.println(builder.toString()); 
}}
	

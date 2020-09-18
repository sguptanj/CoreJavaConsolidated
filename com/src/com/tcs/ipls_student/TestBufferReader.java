package com.tcs.ipls_student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestBufferReader {
	public static void main (String args[])
	{
		String name =null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		PrintWriter pw = new PrintWriter(System.out, true);
		System.out.print("Name : ");
		
		
		try {
			name = br.readLine();
			pw.println(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

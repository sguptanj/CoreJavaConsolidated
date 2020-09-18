package com.tcs.ipls_student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\SIDDHARTH GUPTA\\eclipse-workspace\\com\\src\\com\\tcs\\ipls_student\\demo.txt");
		try {
			int i = fis.read(); // reads the file in the byte form
			while(i!=-1) {
				System.out.print((char)i);
				i = fis.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

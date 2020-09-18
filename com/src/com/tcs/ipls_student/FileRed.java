package com.tcs.ipls_student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileRed {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO read the demo.txt file
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\SIDDHARTH GUPTA\\eclipse-workspace\\com\\src\\com\\tcs\\ipls_student\\demo.txt");
		// messgae to be written to the file
		String msg = " Hello Sid";
		
		// byte conversion
		byte b[] = msg.getBytes();
		
		// To write to the file and all the previous data will be deleted
		try {
			
			fos.write(b);
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

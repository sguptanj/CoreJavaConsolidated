/* 
 @Author: Siddharth Gupta
 @Date: 23-September-2020
 @Functionality: Client program that uses FileReader to fetch the data.When the program is executed, the DataReaderClient gets instantiated
along with a referenced FileReader object. It then uses the FileReader object to fetch
the result.
*/
package com.tcs.jv_advance_concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements Reader{
	
	// creation and Initilizaion of variables
	private StringBuilder builder = null;
	private Scanner input = null;
	
	//methods
	public FileReader(String fileName) throws FileNotFoundException
	{
	  input = new Scanner(new File(fileName));
	  builder = new StringBuilder();
	}
	
	public String read()
	{
		while (input.hasNext())
		{
			builder.append(input.next());
			builder.append(" ");
		}
		return builder.toString();
	}

}

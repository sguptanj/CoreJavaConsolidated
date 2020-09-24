/* 
 @Author: Siddharth Gupta
 @Date: 23-September-2020
 @Functionality: Client program that uses FileReader to fetch the data.
 The DataReaderClient is the client that fetches the data from a
data source. When the program is executed, the DataReaderClient gets instantiated
along with a referenced FileReader object. It then uses the FileReader object to fetch
the result.
*/


package com.tcs.jv_advance_concepts;

import java.io.FileNotFoundException;

public class DataReaderClient {
	
	//creation and initilization of variables
	private Reader readdm = null;
	private static String fileName = "C:\\Users\\SIDDHARTH GUPTA\\git\\JavaProjects\\com\\src\\com\\tcs\\jv_advance_concepts\\testfile.txt";
	
	//
	public DataReaderClient(Reader readdm) {
		this.readdm = readdm;
	}
	
	private String fetchData() {
		return readdm.read();
		}
		
	public static void main(String[] args) throws FileNotFoundException {
		Reader reader = new FileReader(fileName);
		DataReaderClient dataReader = new DataReaderClient(reader);
		System.out.println("Got data: "+dataReader.fetchData());
		}
}

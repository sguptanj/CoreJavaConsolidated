package com.tcs.ipl_learnCollections;

public class DemoGenricsMain {
	
	public static void main (String args[])
	{
		int a =100;
		DemoGenrics<Integer> dm = new DemoGenrics<Integer>(100);
		System.out.println(dm.getValue());
	}

}

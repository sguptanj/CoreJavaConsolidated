package com.tcs.ipl_learnCollections;

import java.util.HashSet;
import java.util.Iterator;

public class ImpHashSt {

	public static void main(String[] args) {
		// TODO to implement an hash set
		
		HashSet<String> hs = new HashSet<String>();
		
		//-- adding data 
		hs.add("Mike");
		hs.add("Ryan");
		hs.add("Jean");
		hs.add("Jainny");
		hs.add("Abhay");
		hs.add("John");
		
		Iterator l = hs.iterator();
		{
			while (l.hasNext())
			{
				System.out.print(l.next() + "  ");
			}
		}
		
		

	}

}

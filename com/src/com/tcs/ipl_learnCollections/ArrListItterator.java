package com.tcs.ipl_learnCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrListItterator {

	public static void main(String[] args) {
		// TODO iterating the array list through an iterator
		
		ArrayList<String> an = new ArrayList<String>();
		an.add("bear");
		an.add("cat");
		an.add("dog");
		
		Iterator i = an.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}

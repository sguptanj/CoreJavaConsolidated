package com.tcs.ipl_learnCollections;

import java.util.ArrayList;

public class AnimalArrList {

	public static void main(String[] args) {
		// TODO: To declare an empty array list and then add Animal names to it
		
		// declaring an arraylist
		ArrayList<String> anNames = new ArrayList<String>();
		
		// adding values to arraylist
		anNames.add("Bear");
		anNames.add("Cat");
		anNames.add("Dog");
		anNames.add("Elephant");
		anNames.remove("Elephant");
		
		// displaying the elements of the arraylist
		System.out.println("The elements of the Array List: ");
		for (int i=0; i<anNames.size(); i++)
		{
			System.out.println(anNames.get(i));
		}
		System.out.println();
		// updated the Bear to Arrow Bird
		anNames.set(0, "Arrow Bird");
		
		//
		for (String an: anNames)
		{
			System.out.println(an);
		}
		
	}
}

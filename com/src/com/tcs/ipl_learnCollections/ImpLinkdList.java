package com.tcs.ipl_learnCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class ImpLinkdList {

	public static void main(String[] args) {
		// TODO to implement a linked list
		
		// initilised a linked list
		LinkedList<String> ll = new LinkedList<String>();
		LinkedList<String> l1 = new LinkedList<String>();
		
		// adding the data to the linked list to the end of the linked list
		ll.addFirst("Mohit");
		ll.add("Rishabh");
		ll.add("Atul");
		ll.add("Danny");
		ll.addLast("Kuber");
		
		l1.add("King");
		l1.add("Queen");
		l1.add("Joker");
		
		
		
		
		// to add data at the certain position of the linked list
		ll.add(1, "Siddharth");
		ll.add(1, "Abhay");
		ll.add(1,"Mohan Das");
		
		
		// to print the LinkedList using the enhanced for loop
		for (String l: ll)
		{
			System.out.print(l + "  ");
		}
		
		System.out.println("\nPerforming the delete at the index 1\n");
		
		// to delete the node
		ll.remove(1);
		
		
		// to print the LinkedList using the Iterator
		Iterator <String> ic = ll.iterator();
				{
			while (ic.hasNext())
			{
				System.out.print(ic.next() + "   ");
			}
		}
		System.out.println("\nAdding the two linkedlist\n");
		// to add the two linked lists
				ll.addAll(l1);
				// to print the LinkedList using the Iterator
				Iterator <String> i = ll.iterator();
						{
					while (i.hasNext())
					{
						System.out.print(i.next() + "  ");
					}
				}
		// to delete the list 
		ll.clear();
		

	}

}

package com.tcs.ipl_learnCollections;

import java.util.TreeSet;

public class ImpTreSt {
	
public static void main(String args[]) {
		// TODO to implement TreeSet
		
		TreeSet<Car> ts = new TreeSet<Car>();
		Car c1 = new Car(1000, "x1 series", "BMW");
		Car c2 = new Car(1500, "x2 series", "BMW");
		Car c3 = new Car(2000, "x3 series", "BMW");
		Car c4 = new Car(2500, "x4 series", "BMW");
		Car c5 = new Car(3000, "x5 series", "BMW");
		
		//Adding the Objects to TreeSet
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);
		
		for(Car cr:ts)
		{
			System.out.println("Car Name: " +cr.name + "|| Brand: " +cr.brand +"|| Price: " +cr.price);
			System.out.println("----------------------------------------------------------------------");
		}
		
		

	}

}

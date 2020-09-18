package com.tcs.ipl_learnCollections;

import java.util.ArrayList;

public class CarMain {

	public static void main(String[] args) {
		// TODO to pass the objects to the arraylist
		
		Car c1 = new Car(1000, "1 Series ", "BMW");
		Car c2 = new Car(1500, "2 Series ", "BMW");
		Car c3 = new Car(2000, "3 Series ", "BMW");
		
		ArrayList<Car> c = new ArrayList<Car>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		for (Car obj : c)
		{
			System.out.println(obj.brand + " " + obj.name + " " +obj.price);
		}
		
		

	}

}

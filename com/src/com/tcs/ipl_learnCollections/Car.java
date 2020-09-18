package com.tcs.ipl_learnCollections;

public class Car implements Comparable<Car>{
	
	int price;
	String name;
	String brand;
	
	Car(int price, String name, String brand)
	{
		this.price = price;
		this.name = name;
		this.brand = brand;
	}

	@Override
	public int compareTo(Car o) {
		// TODO 
		if (price > o.price)
		{
			return -1;
		}
		else if(price < o.price)
		{
			return 1;
		}else {
		return 0;
		}
	}

}

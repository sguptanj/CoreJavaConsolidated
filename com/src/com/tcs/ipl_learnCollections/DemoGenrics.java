package com.tcs.ipl_learnCollections;

public class DemoGenrics <T> {
	T value;
	
	public DemoGenrics(T v)
	{
		value = v;
	}
	
	T getValue() {
		return value;
	}

}

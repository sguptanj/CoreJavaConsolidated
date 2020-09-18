package com.tcs.ilp_learnings;

public class TestLoWhile {

	public static void main(String[] args) {
		// to print the numbers from 0 to 38
		int count=0;
		while (count!=1)
		{
			System.out.print(count);
			count+=2;
			System.out.print(" ");
			if (count == 40)
			{
				count=1;
			}
		}

	}

}

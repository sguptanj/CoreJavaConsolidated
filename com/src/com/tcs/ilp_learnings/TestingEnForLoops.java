package com.tcs.ilp_learnings;

public class TestingEnForLoops {

	public static void main(String[] args) {
		// Testing the enhanced for loop
		
		int number_arr[] = {1,2,3,4,5,6,7,8,9,10};
		int even_no[] = new int [5];
		int odd_no[] = new int[5];
		int i=0, j=0;
		
		for (int a:number_arr)
		{
			System.out.print(a + "  ");
		}
		for (int a:number_arr)
		{
			if(a%2==0)
			{
			 even_no[i] = a;
			 i++;
			}
			else
			{
				odd_no[j] = a;
				 j++;
			}
		}
		System.out.println("\n Even Numbers:");
		for (int a:even_no)
		{
			System.out.print(a + "  ");
		}
		System.out.println("\n Odd Numbers:");
		for (int a:odd_no)
		{
			System.out.print(a + "  ");
		}

	}

}

/* 
 @Author: Siddharth Gupta
 @Date: 19-September-2020
 @Functionality: This is a Trip Planner Code
*/
package com.tcs.trip_planner;

import java.util.Scanner;

public class TripPlanner {
	
	private static String userName;
	private static String destCity;
	private static int days;
	private static float moneySpent;
	

	public static void main(String[] args) {
		greetings();
		next();
		timeAndBudget();
		next();

	}
	//Method details: Greeting functionality added
	public static void greetings()
	{
		System.out.println("Welcome to Vacation Planner!");
		System.out.print("What is your name? ");
		Scanner inputName = new Scanner (System.in);
		userName = inputName.nextLine();
		System.out.print("Nice to meet you " +userName + ", where are you travelling to? ");
		Scanner inputCity = new Scanner (System.in);
		destCity = inputCity.nextLine();
		System.out.println("Great! " +destCity+ " sounds like a great trip");
	}
	//Method details: It has been added just for the alignment purposes 
	public static void next()
	{
		System.out.println("***********\n\n");
	}
	
	//Method details: This method contains the details of the travell time and budget
	public static void timeAndBudget()
	{
		// Variable Declaration
		float currencyConverted = 0.0f;
		int hours = 24;
		int minutes = hours * 60;
		float perDayExpenditure = 0.0f;
		float mcxConverted = 19.8f; // @conversion rate hardcoded
		float perDayMcx =0.0f;
		String currency = null;
		
		// Input from the user
		System.out.print("How many days are they going to spend travelling? ");
		Scanner inputDays = new Scanner (System.in);
		days = inputDays.nextInt();
		System.out.print("How much money, in USD are you planning to spend on your trip? ");
		Scanner inputMoney = new Scanner (System.in);
		moneySpent = inputMoney.nextFloat();
		System.out.print("What is the three letter currency symbol for your travel destination? ");
		Scanner inputCurrency = new Scanner (System.in);
		currency = inputCurrency.nextLine();
		
		// Computation
		hours *= days;
		minutes *= days;
		perDayExpenditure = moneySpent/days;
		mcxConverted *= moneySpent;
		perDayMcx = mcxConverted/days;
		
		// Output Display
		System.out.println("\n\nIf you are travelling for " +days+ " days that is same as "+hours+ " hours or " +minutes+ " minutes");
		System.out.println("If you are going to spend $" +moneySpent+ " USD that means per day you can spend up to $" +perDayExpenditure+ " USD");
		System.out.println("Your total budget in MXC is " +mcxConverted+ " " +currency + ", which means per day is " +perDayMcx+ " " +currency);
	}
	

	

}

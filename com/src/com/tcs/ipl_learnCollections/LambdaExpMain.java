package com.tcs.ipl_learnCollections;

public class LambdaExpMain {

	public static void main(String[] args) {
		
		// CASE 1
		System.out.println("\n---------To check multiplication---------\n");
		Multiplier m;		
		m = (a,b)-> a*b;
		System.out.println(m.Multiply1(2, 4));
		
		// CASE 2
		System.out.println("\n---------To check age---------\n");
		Person p;
		p = (age)->{
			if (age > 18)
			{
				System.out.println("Adult");
			}else {
				System.out.println("Not an Adult");
			}
		};
		p.ageChecker(9);
		
		
		// CASE 3
		System.out.println("\n---------To check message---------\n");
		GenrcInface<String> message;
		message = (mes) -> {
			return mes;
		};
		System.out.println(message.displayMessgae("Hello Message"));
	}

}

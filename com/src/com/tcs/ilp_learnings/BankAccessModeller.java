package com.tcs.ilp_learnings;

public class BankAccessModeller {

	public static void main(String[] args) {
		Bank bk = new Bank();
		
		//To update the Bank branch name
		bk.setBank_name("BOB");
		System.out.println(bk.getBank_name());
	
	}
}

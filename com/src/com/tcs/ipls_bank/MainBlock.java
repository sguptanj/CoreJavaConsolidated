package com.tcs.ipls_bank;

public class MainBlock {

	public static void main(String[] args) {
		// TODO 
		Customer cs = new Customer();
		
		// Customer can access all the 3 methods
		// update_balance can not be invoked as it has been declared private
		cs.deposit();
		cs.withdraw();
		//cs.update_balance();
		
		Privatebank bs = new Privatebank("Siddharth Gupta");
		Govtbankit gb = new Govtbankit("Anil Kumar");
		
		
		//
		bs.interest_paid();
		gb.interest_paid();
		
		

	}

}

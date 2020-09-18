package com.tcs.ipls_bank;

public class Govtbankit implements BankRules{
	
	StringBuffer sb = new StringBuffer();
	
	Govtbankit(String customer_name){
		sb.append(customer_name);
	}

	@Override
	public void interest_paid() {
		// TODO Auto-generated method stub
		System.out.println(sb + " is paid an interest of 7%");
	}

}

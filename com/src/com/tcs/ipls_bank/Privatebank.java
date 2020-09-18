package com.tcs.ipls_bank;

public class Privatebank implements BankRules{
	
	StringBuffer sb = new StringBuffer();
	
	Privatebank(String customer_name)
	{
		sb.append(customer_name);
	}

	@Override
	public void interest_paid() {
		// TODO Auto-generated method stub
		System.out.println(sb + " is paid an interest of 5%");
		
	}

}

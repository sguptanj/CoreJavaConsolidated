package com.tcs.ilp_learnings;

public class Bank {
	
	private String bank_id = null;
	private String bank_ac_no = null;
	public String bank_name = "SBI";
	
	
	
	public String getBank_id() {
		return bank_id;
	}


	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}


	public String getBank_ac_no() {
		return bank_ac_no;
	}


	public void setBank_ac_no(String bank_ac_no) {
		this.bank_ac_no = bank_ac_no;
	}


	public String getBank_name() {
		return bank_name;
	}


	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}


	public void printBalance()
	{
		System.out.println("The Balance is 1000 rs");
	}
	
	
	public void updatePassbook()
	{
		System.out.println("The Passbook is updated");
	}

}

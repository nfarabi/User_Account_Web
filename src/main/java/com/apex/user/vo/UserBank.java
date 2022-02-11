package com.apex.user.vo;

public class UserBank {
private int id;
	
	private String  bankName;
	private String	accountNumber;
	private String  ssnNumber;
	
	
	public UserBank() {
		super();
	}
	public UserBank(int id,  String bankName,
			String accountNumber, String ssnNumber) {
		super();
		this.id = id;
		//this logic take care
		
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ssnNumber = ssnNumber;
		
		
	}
	public int getId() {
		return id;
	}
	public void setbankName(int id) {
		this.id = id;
	}
	public String getbankName() {
		return bankName;
	}
	public void setbankName(String bankName) {
		this.bankName = bankName;
	}
	public String getaccountNumber() {
		return accountNumber;
	}
	public void setaccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getssnNumber() {
		return ssnNumber;
	}
	public void setssnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	
}

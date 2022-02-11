package com.apex.user.vo;

public class User {
	private int id;
	private String  firstName;
	private String	lastName;
	private String  middleName;
	private String  streetName;
	private String	cityName;
	private String  stateName;
	private String  countryName;
	private String  bankName;
	private String	accountNumber;
	private String  ssnNumber;
	
	public User() {
		super();
	}
	/**
	 * This is argument constructor
	 * @param id - id of person
	 * @param firstName - first name of person
	 * @param lastName - last name of person
	 * @param middleName - middle name
	 */
	public User(int id, String firstName, String lastName, String middleName,  String streetName,
			String cityName, String stateName, String countryName, String bankName,
			String accountNumber, String ssnNumber) {
		super();
		this.id = id;
		//this logic take care
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.streetName = streetName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ssnNumber = ssnNumber;
		
		
		
	}
	public int getId() {
		return id;
	}
	public void setFirstName(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setstreettName(int id) {
		this.id = id;
	}
	public String getstreetName() {
		return streetName;
	}
	public void setstreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getcityName() {
		return cityName;
	}
	public void setcityName(String cityName) {
		this.cityName = cityName;
	}
	public String getstateName() {
		return stateName;
	}
	public void setstateName(String stateName) {
		this.stateName = stateName;
	}
	public String getcountryName() {
		return countryName;
	}
	public void setcountryName(String countryName) {
		this.countryName = countryName;
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

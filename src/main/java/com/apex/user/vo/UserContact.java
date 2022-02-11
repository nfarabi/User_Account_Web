package com.apex.user.vo;

public class UserContact {
	private int id;
	
	private String  streetName;
	private String	cityName;
	private String  stateName;
	private String  countryName;
	
	public UserContact() {
		super();
	}
	public UserContact(int id,  String streetName,
			String cityName, String stateName, String countryName) {
		super();
		this.id = id;
		//this logic take care
		
		this.streetName = streetName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
		
	}
	public int getId() {
		return id;
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

}

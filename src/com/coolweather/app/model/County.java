package com.coolweather.app.model;

public class County {

	private int id;
	
	private String countyName;
	
	private String countyCode;
	
	private int cityId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countyName;
	}

	public void setCountryName(String countyName) {
		this.countyName = countyName;
	}

	public String getCountryCode() {
		return countyCode;
	}

	public void setCountryCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
}

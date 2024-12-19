package com.example.goosetrip.dto;

public class PersonInfo {
	private String id;

	private String userName;

	private int userAge;

	private String city;

	public PersonInfo() {
		super();
	}

	public PersonInfo(String id, String userName, int userAge, String city) {
		super();
		this.id = id;
		this.userName = userName;
		this.userAge = userAge;
		this.city = city;
	}

	public String getUserId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public String getCity() {
		return city;
	}

}

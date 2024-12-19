package com.example.goosetrip.vo;

public class CreateReq {
	private String id;

	private String name;

	private int age;

	private String city;

	public CreateReq() {
		super();
	}

	public CreateReq(String id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

}

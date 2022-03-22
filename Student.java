package com.spring;

public class Student {
	private int id;
	private String name;
	private String branch;
	private String section;
	private String city;
	private String state;
	private long zipcode;
	
	public Student() {

	}

	public Student(int id, String name, String branch, String section, String city, String state, long zipcode) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.section = section;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", section=" + section + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + "]";
	}
	
	
}

package com.ridesharingapp.model;

import com.ridesharingapp.constants.GenderEnum;

/**
 * @author Abhinav
 *
 */
public class User {
	private String name;
	private GenderEnum gender;
	private Integer age;
	private Integer ridesOffered;
	private Integer ridesTaken;
	public User() {}
	public User(String name, GenderEnum gender, Integer age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GenderEnum getGender() {
		return gender;
	}
	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getRidesOffered() {
		return ridesOffered;
	}
	public void setRidesOffered(Integer ridesOffered) {
		this.ridesOffered = ridesOffered;
	}
	public Integer getRidesTaken() {
		return ridesTaken;
	}
	public void setRidesTaken(Integer ridesTaken) {
		this.ridesTaken = ridesTaken;
	}
}

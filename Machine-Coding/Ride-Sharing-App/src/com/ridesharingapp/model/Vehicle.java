package com.ridesharingapp.model;

public class Vehicle {
	private User owner;
	private String vehicleName;
	private String vehicleNumber;
	public Vehicle() {}
	public Vehicle(User owner, String vehicleName, String vehicleNumber) {
		super();
		this.owner = owner;
		this.vehicleName = vehicleName;
		this.vehicleNumber = vehicleNumber;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
}

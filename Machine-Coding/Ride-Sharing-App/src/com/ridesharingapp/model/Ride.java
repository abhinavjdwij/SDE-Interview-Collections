package com.ridesharingapp.model;

import java.util.List;

import com.ridesharingapp.constants.LocationEnum;

public class Ride {
	private Vehicle rideVehicle;
	private Integer seatsOffered; // seatsAvailable = seatsOffered - ridersOnboarded
	private List<User> ridersOnboarded;
	private LocationEnum startLocation;
	private LocationEnum endLocation;
	public Ride() {}
	public Ride(Vehicle rideVehicle, Integer seatsOffered, LocationEnum startLocation, LocationEnum endLocation) {
		super();
		this.rideVehicle = rideVehicle;
		this.seatsOffered = seatsOffered;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
	}
	public Vehicle getRideVehicle() {
		return rideVehicle;
	}
	public void setRideVehicle(Vehicle rideVehicle) {
		this.rideVehicle = rideVehicle;
	}
	public Integer getSeatsOffered() {
		return seatsOffered;
	}
	public void setSeatsOffered(Integer seatsOffered) {
		this.seatsOffered = seatsOffered;
	}
	public List<User> getRidersOnboarded() {
		return ridersOnboarded;
	}
	public void setRidersOnboarded(List<User> ridersOnboarded) {
		this.ridersOnboarded = ridersOnboarded;
	}
	public LocationEnum getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(LocationEnum startLocation) {
		this.startLocation = startLocation;
	}
	public LocationEnum getEndLocation() {
		return endLocation;
	}
	public void setEndLocation(LocationEnum endLocation) {
		this.endLocation = endLocation;
	}
}

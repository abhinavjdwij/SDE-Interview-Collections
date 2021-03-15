package com.ridesharingapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.ridesharingapp.model.Vehicle;

// Singleton
public class VehicleDao {
	private static VehicleDao instance = null;
	List<Vehicle> vehicleList;
	private VehicleDao() {
		this.vehicleList = new ArrayList<>();
	}
	public static VehicleDao getInstance() {
		if (instance == null) {
			instance = new VehicleDao();
		}
		return instance;
	}
	public void addVehicle(Vehicle newVehicle) {
		this.vehicleList.add(newVehicle);
	}
}

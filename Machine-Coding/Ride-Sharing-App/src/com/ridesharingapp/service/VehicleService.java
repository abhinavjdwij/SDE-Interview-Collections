package com.ridesharingapp.service;

import com.ridesharingapp.dao.VehicleDao;
import com.ridesharingapp.model.Vehicle;

public class VehicleService {
	public void addVehicle(Vehicle newVehicle) {
		VehicleDao vehicleDao = VehicleDao.getInstance();
		// TODO validations
		vehicleDao.addVehicle(newVehicle);
	}
}

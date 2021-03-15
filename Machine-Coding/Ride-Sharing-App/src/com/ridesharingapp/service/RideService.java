package com.ridesharingapp.service;

import com.ridesharingapp.dao.RideDao;
import com.ridesharingapp.model.Ride;

public class RideService {
	public void offerRide(Ride newRide) {
		RideDao rideDao = RideDao.getInstance();
		// TODO validations
		rideDao.offerRide(newRide);
	}
}

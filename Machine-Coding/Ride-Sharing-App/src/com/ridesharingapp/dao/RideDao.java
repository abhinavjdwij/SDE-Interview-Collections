package com.ridesharingapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ridesharingapp.model.Ride;
import com.ridesharingapp.model.Route;

// Singleton
public class RideDao {
	private static RideDao instance = null;
	Map<Route, List<Ride>> rideMap;
	private RideDao() {
		this.rideMap = new HashMap<>();
	}
	public static RideDao getInstance() {
		if (instance == null) {
			instance = new RideDao();
		}
		return instance;
	}
	public void offerRide(Ride newRide) {
		Route rideRoute = new Route(newRide.getStartLocation(), newRide.getEndLocation());
		if (!this.rideMap.containsKey(rideRoute)) {
			this.rideMap.put(rideRoute, new ArrayList<>());
		}
		this.rideMap.get(rideRoute).add(newRide);
	}
}

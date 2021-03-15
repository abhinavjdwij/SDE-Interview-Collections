package com.ridesharingapp.model;

import com.ridesharingapp.constants.LocationEnum;

public class Route {
	private LocationEnum source;
	private LocationEnum destination;
	public Route() {}
	public Route(LocationEnum source, LocationEnum destination) {
		super();
		this.source = source;
		this.destination = destination;
	}
	public LocationEnum getSource() {
		return source;
	}
	public void setSource(LocationEnum source) {
		this.source = source;
	}
	public LocationEnum getDestination() {
		return destination;
	}
	public void setDestination(LocationEnum destination) {
		this.destination = destination;
	}
}

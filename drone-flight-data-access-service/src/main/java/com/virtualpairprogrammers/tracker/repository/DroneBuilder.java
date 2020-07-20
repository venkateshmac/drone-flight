package com.virtualpairprogrammers.tracker.repository;

import com.virtualpairprogrammers.tracker.domain.DroneData;

public class DroneBuilder {
	
	private String flightId;

	public DroneBuilder withFlightId(String sessionId) {
		this.flightId = sessionId;
		return this;
	}
	
	public DroneData build() {
		return new DroneData();
	}

}

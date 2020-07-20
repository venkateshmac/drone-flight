package com.virtualpairprogrammers.tracker.repository;

import com.virtualpairprogrammers.tracker.domain.DroneData;

public class DroneBuilder {
	
	private String flightSessionId;

	public DroneBuilder withFlightSessionId(String sessionId) {
		this.flightSessionId = flightSessionId;
		return this;
	}
	
	public DroneData build() {
		return new DroneData();
	}

}

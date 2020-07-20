package com.virtualpairprogrammers.tracker.repository;

import com.virtualpairprogrammers.tracker.domain.DroneData;

public interface DroneDataModel {
	public DroneData findFlightSessionId(String flightSessionId) ;

}

package com.virtualpairprogrammers.api.services;

import java.util.Collection;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtualpairprogrammers.api.domain.DroneData;

//@FeignClient(url="${position-tracker-url}", name="fleetman-position-tracker")
@FeignClient(url="fleet-position-tracker", name="fleetman-position-tracker")
public interface RemoteDroneFlightMicroserviceCalls {

	@RequestMapping(method=RequestMethod.GET, value="/pilot/allDrones")
	public Collection<DroneData> getAllDrones();

	@RequestMapping(method=RequestMethod.GET, value="/pilot/droneDataFetch/{flight_sessionId}")
	public Collection<DroneData> getDroneData(@PathVariable("flight_sessionId") String flightSessionId);
	
	
	
}

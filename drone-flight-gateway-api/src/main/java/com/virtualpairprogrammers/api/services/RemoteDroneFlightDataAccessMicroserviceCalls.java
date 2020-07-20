package com.virtualpairprogrammers.api.services;

import java.util.Collection;
import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtualpairprogrammers.api.domain.DroneData;

@FeignClient(url="http://dronefleet-flight-access:8080", name="dronefleet-flight-access")

public interface RemoteDroneFlightDataAccessMicroserviceCalls {

	@RequestMapping(method=RequestMethod.GET, value="/pilot/allDrones")
	public List<com.virtualpairprogrammers.api.domain.DroneData> getAllDrones();

	@RequestMapping(method=RequestMethod.GET, value="/pilot/droneDataFetch/{flight_sessionId}")
	public Collection<com.virtualpairprogrammers.api.domain.DroneData> getDroneData(@PathVariable("flight_sessionId") String flightSessionId);
	
	@RequestMapping(method=RequestMethod.GET, value="/pilot/testE2E/dataAccess/{name}")
	public String getTestE2E(@PathVariable("name") String name);
	

	
	
	

}

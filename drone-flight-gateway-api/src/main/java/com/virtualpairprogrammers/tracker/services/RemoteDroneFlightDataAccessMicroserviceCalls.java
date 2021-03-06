package com.virtualpairprogrammers.tracker.services;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.virtualpairprogrammers.tracker.domain.DroneData;



@FeignClient(url="http://dronefleet-flight-access:8080", name="dronefleet-flight-access")

public interface RemoteDroneFlightDataAccessMicroserviceCalls {

	@RequestMapping(method=RequestMethod.GET, value="/pilot/allDrones")
	public List<DroneData> getAllDrones();

	@RequestMapping(method=RequestMethod.GET, value="/pilot/droneDataFetch/{flight_sessionId}")
	@ResponseBody
	public ResponseEntity<Object> getDroneData(@PathVariable("flight_sessionId") String flightSessionId);
	
	@RequestMapping(method=RequestMethod.GET, value="/pilot/testE2E/dataAccess/{name}")
	public String getTestE2E(@PathVariable("name") String name);
	

	
	
	

}

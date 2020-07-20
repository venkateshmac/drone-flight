package com.virtualpairprogrammers.api.services;

import java.util.Collection;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtualpairprogrammers.api.domain.DroneData;

@FeignClient(url="http://dronefleet-flight:8080", name="dronefleet-flight")

public interface RemoteDroneFlightMicroserviceCalls {

	@RequestMapping(method=RequestMethod.GET, value="/pilot/allDrones")
	public Collection<DroneData> getAllDrones();

	@RequestMapping(method=RequestMethod.GET, value="/pilot/droneDataFetch/{flight_sessionId}")
	public Collection<DroneData> getDroneData(@PathVariable("flight_sessionId") String flightSessionId);
	
	@RequestMapping(method=RequestMethod.GET, value="/pilot/testE2E/{name}")
	public String getTestE2E(@PathVariable("name") String name);
	
	@RequestMapping(value = "/pilot/uploadFilghtData/" , method = RequestMethod.POST)
	public String uploadFilghtData(@RequestBody DroneData customer);
}

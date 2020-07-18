package com.virtualpairprogrammers.api.controllers;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.virtualpairprogrammers.api.domain.DroneData;
import com.virtualpairprogrammers.api.services.DroneFlightExternalService;

@Controller
@RequestMapping("/")
public class DroneFlightController 
{	
	
	@Autowired
	private DroneFlightExternalService externalService;

	private Date lastUpdateTime;

	@GetMapping("/")
	@ResponseBody
	/**
	 * This is just a test mapping so we can easily check the API gateway is standing.
	 * When running through the Angular Front end, can visit this URL at /api/
	 */
	public String apiTestUrl()
	{
		return "<p>Drone Flight Fleetman API Gateway at " + new Date() + "</p>";
	}

	
	@GetMapping("/pilot/droneDataFetch/{flight_sessionId}")
	@ResponseBody
	@CrossOrigin(origins="*")
	public Collection<DroneData> fetchDroneData(@PathVariable("flight_sessionId") String flightSessionId){
		//Collection<DroneData> results = new ArrayList<>();
		Collection<DroneData> drones = externalService.getDroneData(flightSessionId);
		return drones;
	}
	
	

//	@Scheduled(fixedRate=2000)
//	public void updatePositions()
//	{
//		Collection<VehiclePosition> results = externalService.getAllUpdatedPositionsSince(lastUpdateTime);
//		this.lastUpdateTime = new Date();
//		for (VehiclePosition next: results)
//		{
//			this.messagingTemplate.convertAndSend("/vehiclepositions/messages", next);
//		}
//	}
}

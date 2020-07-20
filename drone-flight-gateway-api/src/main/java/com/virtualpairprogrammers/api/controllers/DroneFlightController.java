package com.virtualpairprogrammers.api.controllers;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.virtualpairprogrammers.api.domain.DroneData;
import com.virtualpairprogrammers.api.services.DroneFlightDataAccessExternalService;
import com.virtualpairprogrammers.api.services.DroneFlightDataUploadExternalService;

@Controller
@RequestMapping("/")
public class DroneFlightController 
{	
	
	@Autowired
	private DroneFlightDataAccessExternalService externalDataAccessService;
	
	@Autowired
	private DroneFlightDataUploadExternalService externalDataUploadService;


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
   
	@GetMapping("/testE2E/dataAccess/{name}")
	@ResponseBody
	public String performDataAccessTestE2E(@PathVariable("name") String name) {
		System.out.println("########Perform DataAccess E2E TEST CONTROLLER");
		return externalDataAccessService.getTestE2E(name);
	}
	
	@GetMapping("/testE2E/dataUpload/{name}")
	@ResponseBody
	public String performDataUploadTestE2E(@PathVariable("name") String name) {
		System.out.println("########Perform DataUpload E2E TEST CONTROLLER");
		return externalDataUploadService.getTestE2E(name);
	}
	
	@GetMapping("/pilot/droneDataFetch/{flight_sessionId}")
	@ResponseBody
	@CrossOrigin(origins="*")
	public Collection<DroneData> fetchDroneData(@PathVariable("flight_sessionId") String flightSessionId){
		
		Collection<DroneData> drones = externalDataAccessService.getDroneData(flightSessionId);
		return drones;
	}
	
//	@RequestMapping(value = "/pilot/uploadFlightData" , method = RequestMethod.POST)
//	public String uploadFilghtData(@RequestBody DroneData data){
//		System.out.println("########UPload FilghtData#######");
//		return externalDataUploadService.uploadFilghtData(data);
//	}
	
	
	


}

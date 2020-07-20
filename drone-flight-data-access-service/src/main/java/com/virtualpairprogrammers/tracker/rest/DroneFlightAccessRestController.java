package com.virtualpairprogrammers.tracker.rest;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtualpairprogrammers.tracker.domain.DroneData;
import com.virtualpairprogrammers.tracker.exception.DroneNotFoundErrorResponse;
import com.virtualpairprogrammers.tracker.repository.DroneDataModel;
import com.virtualpairprogrammers.tracker.repository.DroneRepository;



@RestController
public class DroneFlightAccessRestController {
	
//	@Autowired
//	private CustomerRepository repository;
	@Autowired
	private DroneRepository droneRepo;
	
	@Autowired
	private DroneDataModel model;
	

	

	@RequestMapping("/pilot/allDrones")
	public List<DroneData> findFlights(){
		final List<DroneData> flights = droneRepo.findAll();
		
		return flights;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/pilot/droneDataFetch/{flight_sessionId}")
	@ResponseBody
	public ResponseEntity<Object> findFlightDetails(@PathVariable String flight_sessionId)  {
		 DroneData data = null;
		
		  data = model.findFlightSessionId(flight_sessionId);
		  //System.out.println("FLIGTHSESSIONID..."+ data.getFlightSessionId());
		  if(data != null) {
		   return new ResponseEntity<>(data, HttpStatus.OK);
		  }else {
			  DroneNotFoundErrorResponse errorResponse = new DroneNotFoundErrorResponse();
			  errorResponse.setTimestamp(LocalDateTime.now());
			  errorResponse.setError(flight_sessionId + ": Drone Details Not Available");
			  return new ResponseEntity<>(errorResponse,null,HttpStatus.NOT_FOUND); 
		  }
		
	}
	
	@RequestMapping("/drone")
	public String getDroneTest(){
		return "<p>Drone Flight Data access Service Up " + new Date() + "</p>";
	}
	
	///pilot/testE2E/{name}
	@RequestMapping(method=RequestMethod.GET, value="/pilot/testE2E/dataAccess/{name}")
	public String performE2ETest(@PathVariable String name){
		return  "Welcome to Drone Flight" + name+"....!";
	}
		
	
	
	
	
}

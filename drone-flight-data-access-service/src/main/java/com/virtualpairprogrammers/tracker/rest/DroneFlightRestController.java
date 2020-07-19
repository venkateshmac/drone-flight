package com.virtualpairprogrammers.tracker.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtualpairprogrammers.tracker.domain.DroneData;
import com.virtualpairprogrammers.tracker.repository.DroneDataModel;
import com.virtualpairprogrammers.tracker.repository.DroneNotFoundException;
import com.virtualpairprogrammers.tracker.repository.DroneRepository;



@RestController
public class DroneFlightRestController {
	
//	@Autowired
//	private CustomerRepository repository;
	@Autowired
	private DroneRepository droneRepo;
	
	@Autowired
	private DroneDataModel model;
	
//	
//	@RequestMapping("customer/")
//	public List<Customer> findAll(){
//		final List<Customer> customers = repository.findAll();
//		log.info("Fetching customers from database {}" , customers);
//		return customers;
//	}
//	
//	@RequestMapping(value = "customer/" , method = RequestMethod.POST)
//	public void save(@RequestBody Customer customer){
//		log.info("Storing customer in database {}", customer);
//		repository.save(customer);
//	}
//	
	
	
	@RequestMapping(value = "droneFlight" , method = RequestMethod.POST)
	public void droneSave(@RequestBody DroneData drone){
		//log.info("Storing customer in database {}", drone);
		droneRepo.save(drone);
	}
	
	@RequestMapping("/flights")
	public List<DroneData> findFlights(){
		final List<DroneData> flights = droneRepo.findAll();
		
		return flights;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/findFlight/{droneSessionID}")
	public ResponseEntity<DroneData> findFlightDetails(@PathVariable String droneSessionID)  {
		 DroneData data = null;
		try {
		  data = model.findFlightSessionId(droneSessionID);
		
		}catch(DroneNotFoundException e) {
			 return new ResponseEntity<>(null, null, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(data, HttpStatus.OK);
		
		
		
	}
	
	@RequestMapping("/drone")
	public String getDroneTest(){
		return "<p>Drone Flight Data access Service Up " + new Date() + "</p>";
	}
	
	///pilot/testE2E/{name}
	@RequestMapping(method=RequestMethod.GET, value="/pilot/testE2E/{name}")
	public ResponseEntity<String> performE2ETest(@PathVariable String name){
		System.out.println("################PerformE2ETest##########");
		return  new ResponseEntity<>("Welcome to Drone Flight" + name+"....!",HttpStatus.OK);
	}
		
	
	
	
	
}

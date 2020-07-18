package com.virtualpairprogrammers.tracker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.virtualpairprogrammers.tracker.domain.DroneData;

public interface DroneRepository extends MongoRepository<DroneData, String> {

    //public Customer findByFirstName(String firstName);
    //public List<Customer> findByLastName(String lastName);
	//public DroneData findFlightSessionId(String flightSessionId) throws DroneNotFoundException;
	
	

}

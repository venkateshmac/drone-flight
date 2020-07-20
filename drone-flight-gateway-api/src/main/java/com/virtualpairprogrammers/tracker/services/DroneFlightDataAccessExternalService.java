package com.virtualpairprogrammers.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.virtualpairprogrammers.tracker.domain.DroneData;

@Service
public class DroneFlightDataAccessExternalService {
   @Autowired
   private RemoteDroneFlightDataAccessMicroserviceCalls remoteFlightDataAccessService;
   
   public List<DroneData> getAllDrones(){
	   List<DroneData> drones = remoteFlightDataAccessService.getAllDrones();
	   System.out.println("########Drones" + drones);
	   return drones;
   }
   public ResponseEntity<Object> getDroneData( String flightSessionId){
	   return remoteFlightDataAccessService.getDroneData(flightSessionId);
   }
   
   public String getTestE2E(String name) {
	   System.out.println("##########PERFORM TEST#########");
	   return remoteFlightDataAccessService.getTestE2E(name);
   }
   
  
	
}

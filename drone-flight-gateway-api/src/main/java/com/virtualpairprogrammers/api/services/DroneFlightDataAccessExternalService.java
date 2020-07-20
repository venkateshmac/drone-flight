package com.virtualpairprogrammers.api.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtualpairprogrammers.api.domain.DroneData;

@Service
public class DroneFlightDataAccessExternalService {
   @Autowired
   private RemoteDroneFlightDataAccessMicroserviceCalls remoteFlightDataAccessService;
   
   public List<DroneData> getAllDrones(){
	   return remoteFlightDataAccessService.getAllDrones();
   }
   public Collection<DroneData> getDroneData( String flightSessionId){
	   return remoteFlightDataAccessService.getDroneData(flightSessionId);
   }
   
   public String getTestE2E(String name) {
	   System.out.println("##########PERFORM TEST#########");
	   return remoteFlightDataAccessService.getTestE2E(name);
   }
   
  
	
}

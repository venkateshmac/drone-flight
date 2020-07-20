package com.virtualpairprogrammers.api.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtualpairprogrammers.api.domain.DroneData;

@Service
public class DroneFlightExternalService {
   @Autowired
   private RemoteDroneFlightMicroserviceCalls remoteFlightService;
   
   public Collection<DroneData> getAllDrones(){
	   return remoteFlightService.getAllDrones();
   }
   public Collection<DroneData> getDroneData( String flightSessionId){
	   return remoteFlightService.getDroneData(flightSessionId);
   }
   
   public String getTestE2E(String name) {
	   System.out.println("##########PERFORM TEST#########");
	   return remoteFlightService.getTestE2E(name);
   }
   
   public String uploadFilghtData(DroneData data) {
	   System.out.println("########UPload FilghtData#######");
	   return remoteFlightService.uploadFilghtData(data);
   }
	
}

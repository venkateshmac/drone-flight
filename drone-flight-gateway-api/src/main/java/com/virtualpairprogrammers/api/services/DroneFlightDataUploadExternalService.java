package com.virtualpairprogrammers.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtualpairprogrammers.api.domain.DroneData;

@Service
public class DroneFlightDataUploadExternalService {
   @Autowired
   private RemoteDroneFlightDataUploadMicroserviceCalls remoteFlightDataUploadService;
   
  
   
   public String getTestE2E(String name) {
	   System.out.println("##########PERFORM TEST#########");
	   return remoteFlightDataUploadService.getTestE2E(name);
   }
   
   public String uploadFilghtData(DroneData data) {
	   System.out.println("########UPload FilghtData#######");
	   return remoteFlightDataUploadService.uploadFilghtData(data);
   }
	
}

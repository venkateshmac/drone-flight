package com.virtualpairprogrammers.api.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtualpairprogrammers.api.domain.DroneData;

@FeignClient(url="http://dronefleet-flight-upload:8080", name="dronefleet-flight-upload")

public interface RemoteDroneFlightDataUploadMicroserviceCalls{

	
	
	@RequestMapping(method=RequestMethod.GET, value="/pilot/testE2E/dataUpload/{name}")
	public String getTestE2E(@PathVariable("name") String name);
	
	
	@RequestMapping(value = "/pilot/uploadFilghtData/" , method = RequestMethod.POST)
	public String uploadFilghtData(@RequestBody DroneData drone);
	
	
}

package com.virtualpairprogrammers.tracker.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import com.virtualpairprogrammers.tracker.domain.DroneData;

@Repository
public class DroneDataModelImpl implements DroneDataModel {
	
	@Autowired
	private DroneRepository droneRepo;
	
	

	@Override
	public DroneData findFlightSessionId(String flightSessionId)  {
		
		Example<DroneData> example = Example.of(new DroneBuilder().withFlightSessionId(flightSessionId).build());
		List<DroneData> drones = droneRepo.findAll(example);
		if(drones != null && drones.size() >0) {
			return drones.get(0);
		}else {
			return null;
		}
	}

	

	

}

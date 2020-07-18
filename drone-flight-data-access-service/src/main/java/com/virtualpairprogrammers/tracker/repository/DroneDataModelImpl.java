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
	public DroneData findFlightSessionId(String flightSessionId) throws DroneNotFoundException {
		
		Example<DroneData> example = Example.of(new DroneBuilder().withFlightSessionId(flightSessionId).build());
		List<DroneData> all = droneRepo.findAll(example);
		if (all.size() == 0) throw new DroneNotFoundException();
		return all.get(all.size() - 1);
	}

	

	

}

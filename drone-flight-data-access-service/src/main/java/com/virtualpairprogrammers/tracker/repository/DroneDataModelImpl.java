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
	public DroneData findFlightSessionId(String flightId)  {
		
		Example<DroneData> example = Example.of(new DroneBuilder().withFlightId(flightId).build());
		List<DroneData> drones = droneRepo.findAll(example);
		DroneData resultDrone = null;
		
			for(DroneData droneData : drones) {
				System.out.println("FLIGHTSESSIONID...." + droneData.getFlightId());
				if(droneData.getFlightId().equalsIgnoreCase(flightId)) {
					System.out.println("FLIGHTSESSIONID....Matched" + droneData.getFlightSessionId());
					resultDrone = droneData;
					break;
				}
			}
			if(resultDrone != null) {
				System.out.println("NOT NULLFLIGHTSESSIONID...." + resultDrone.getFlightSessionId());
				return resultDrone;
			}else {
				return null;
			}
	}

	

	

}

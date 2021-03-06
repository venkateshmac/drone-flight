package com.virtualpairprogrammers.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCircuitBreaker
@EnableFeignClients
public class DroneFlightGatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroneFlightGatewayApiApplication.class, args);
	}

}

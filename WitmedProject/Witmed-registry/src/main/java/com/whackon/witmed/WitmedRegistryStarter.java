package com.whackon.witmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WitmedRegistryStarter {
	public static void main(String[] args) {
		SpringApplication.run(WitmedRegistryStarter.class, args);
	}
}

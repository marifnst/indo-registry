package com.indo.integration.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IndoIntegrationRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndoIntegrationRegistryApplication.class, args);
	}

}

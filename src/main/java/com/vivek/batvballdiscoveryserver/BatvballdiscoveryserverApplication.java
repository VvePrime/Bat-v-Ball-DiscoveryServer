package com.vivek.batvballdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BatvballdiscoveryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatvballdiscoveryserverApplication.class, args);
	}

}

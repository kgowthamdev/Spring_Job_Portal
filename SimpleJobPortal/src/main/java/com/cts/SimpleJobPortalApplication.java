package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.cts.model")
public class SimpleJobPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleJobPortalApplication.class, args);
	}

}

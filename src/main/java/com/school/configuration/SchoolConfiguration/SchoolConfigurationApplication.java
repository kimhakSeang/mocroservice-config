package com.school.configuration.SchoolConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class SchoolConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolConfigurationApplication.class, args);
	}

}

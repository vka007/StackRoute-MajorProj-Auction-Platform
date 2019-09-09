package com.stackroute.auction.registrationform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.stackroute.auction.registrationform")
@SpringBootApplication
public class RegistrationformApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RegistrationformApplication.class, args);
	}
}

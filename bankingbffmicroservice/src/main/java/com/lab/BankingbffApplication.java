package com.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class BankingbffApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingbffApplication.class, args);
	}
}

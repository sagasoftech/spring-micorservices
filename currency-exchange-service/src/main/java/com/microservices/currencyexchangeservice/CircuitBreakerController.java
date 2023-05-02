package com.microservices.currencyexchangeservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {

	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping("/sample-api")
	//@Retry(name="sample-api", fallbackMethod = "hardcodedMethod")
	//@CircuitBreaker(name="sample-api", fallbackMethod = "hardcodedMethod")
	@RateLimiter(name="sample-api")
	public String sampleApi() {
		logger.info("Sample API call received");
		//ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/dummy-service", String.class);
		//return forEntity.getBody();
		return "sample-api";
	}
	
	public String hardcodedMethod(Exception ex) {
		return "fallback-response";
	}
}

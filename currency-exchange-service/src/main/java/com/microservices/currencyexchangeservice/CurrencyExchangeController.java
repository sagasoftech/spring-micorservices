package com.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeRepository repository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchage retriveExcangeValue(
			@PathVariable String from, 
			@PathVariable String to) {
		
		logger.info("retriveExcangeValue called with {} and {}", from, to);
		
		CurrencyExchage currencyExchage = repository.findByFromAndTo(from, to);
		
		if(currencyExchage == null) {
			throw new RuntimeException("Unable to find for " + from + " to " + to);
		}
		String port = environment.getProperty("local.server.port");
		currencyExchage.setEnvironment(port);
		
		return currencyExchage;
	}
}

package com.microservices.springcloudconfigserver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository 
	extends JpaRepository<CurrencyExchage, Long>{

	/*
	 * JPA will automatically build query to find the rows with
	 * given column name if we follow naming convention as below
	 */
	public CurrencyExchage findByFromAndTo(String from, String to);
}

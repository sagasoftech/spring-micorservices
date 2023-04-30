package com.microservices.springcloudconfigserver;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchage {

	@Id
	private Long id;
	
	/*
	 * Column property is added because from is SQL keyword and 
	 * cannot use it as a column
	 */
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private BigDecimal conversionMuntiple;
	
	private String environment;
	
	public CurrencyExchage() {
		super();
	}
	
	public CurrencyExchage(Long id, String from, String to, BigDecimal conversionMuntiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMuntiple = conversionMuntiple;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMuntiple() {
		return conversionMuntiple;
	}
	public void setConversionMuntiple(BigDecimal conversionMuntiple) {
		this.conversionMuntiple = conversionMuntiple;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

}

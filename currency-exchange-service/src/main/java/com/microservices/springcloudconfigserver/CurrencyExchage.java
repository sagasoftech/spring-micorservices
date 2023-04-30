package com.microservices.springcloudconfigserver;

import java.math.BigDecimal;

public class CurrencyExchage {

	private Long id;
	private String from;
	private String to;
	private BigDecimal currencyMuntiple;
	
	
	public CurrencyExchage() {
		super();
	}
	
	public CurrencyExchage(Long id, String from, String to, BigDecimal currencyMuntiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.currencyMuntiple = currencyMuntiple;
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
	public BigDecimal getCurrencyMuntiple() {
		return currencyMuntiple;
	}
	public void setCurrencyMuntiple(BigDecimal currencyMuntiple) {
		this.currencyMuntiple = currencyMuntiple;
	}

}

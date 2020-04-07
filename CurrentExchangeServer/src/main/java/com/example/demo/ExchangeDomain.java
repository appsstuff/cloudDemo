package com.example.demo;

import java.math.BigDecimal;

public class ExchangeDomain {
	
	private String from;
	private String to;
	private int port;
	private String instance;
	private int ammount;
	private BigDecimal rate;
	private BigDecimal exchanged;
	
	

	public int getAmmount() {
		return ammount;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	public BigDecimal getExchanged() {
		return exchanged;
	}
	public void setExchanged(BigDecimal exchanged) {
		this.exchanged = exchanged;
	}

		
	public String getInstance() {
		return instance;
	}
	public void setInstance(String instance) {
		this.instance = instance;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
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
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public ExchangeDomain(int id, String from, String to, int port, BigDecimal rate) {
		super();
		this.from = from;
		this.to = to;
		this.port = port;
		this.rate = rate;
	}
	public ExchangeDomain() {
	}

	
	
}

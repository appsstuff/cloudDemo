package com.example.demo;

import java.math.BigDecimal;

public class Exchange {
	private Integer id;
	private String from;
	private String to;
	private BigDecimal rate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Exchange(int id, String from, String to, int port, BigDecimal rate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.rate = rate;
	}
	public Exchange() {
		super();
	}	
}
